package ch7;

public class InterfaceTest3 {
    public static void main(String[] args) {
        A a = new A();
        a.methodA();
    }
}

class A {
    void methodA() {
        I i = InsstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}

interface I {
    public abstract void methodB();
}

class B implements I {
    @Override
    public void methodB() {
        System.out.println("methodB in class");
    }
}

class InsstanceManager {
    public static I getInstance() {
        return new B();
    }
}