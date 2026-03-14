public class P2Abstraction {
    // 1. Using an abstract class
    public static abstract class Shape {
        abstract void area();
    }
    public static class Circle extends Shape {
        private double r;
        public Circle(double r) { this.r = r; }
        @Override
        void area() {
            System.out.println("Area of circle is " + (Math.PI * r * r));
        }
    }

    // 2. Using an interface
    public interface IShape {
        void area();
    }
    public static class Rectangle implements IShape {
        private double w, h;
        public Rectangle(double w, double h) { this.w = w; this.h = h; }
        @Override
        public void area() {
            System.out.println("Area of rectangle is " + (w * h));
        }
    }

    public static void main(String[] args) {
        // demo for abstract class
        Shape s = new Circle(2.0);
        s.area();

        // demo for interface
        IShape r = new Rectangle(3.0, 4.0);
        r.area();
    }
}
