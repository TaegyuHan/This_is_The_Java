package ch7;

public class DarwShape {
    public static void main(String[] args) {
        Point[] p = {
                new Point(100, 100),
                new Point(140, 50),
                new Point(200, 100)
        };

        Triangle t = new Triangle(p);
        Cricle c = new Cricle(new Point(150, 150), 50);

        t.draw();
        c.draw();
    }
}

class Shape {
    String color = "black";
    void draw() {
        System.out.printf("[color=%s]\n", color);
    }
}

class Cricle extends Shape {
    Point center;
    int r;

    Cricle() {
        this(new Point(0, 0), 100);
    }

    Cricle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    void draw() {
        System.out.printf("[center=(%d, %d), r=%d, color=%s]\n", center.x, center.y, r, color);
    }
}

class Triangle extends Shape {
    Point[] p = new Point[3];

    Triangle(Point[] p) {
        this.p = p;
    }

    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s], color=%s]\n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}




