package chapter01.chapter07;

class PointTest {
    public static void main(String args[]) {
        Point3D p3 = new Point3D(1,2,3);
    }
}

class Point3D extends Point {
    int z;

    Point3D() {
        this(100, 200, 300);
    }

    Point3D(int x, int y, int z) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation() {	// ¿À¹ö¶óÀÌµù
        return "x :" + x + ", y :"+ y + ", z :" + z;
    }
}
