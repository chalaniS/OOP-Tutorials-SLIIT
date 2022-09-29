package T2;

//ex2 - filename - PointApp.java

public class Ex2 {

    static class Point3D {
        double x, y, z;

        public Point3D(double X, double Y, double Z) {
            x = X;
            y = Y;
            z = Z;
        }

        public double distance() {

            return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
        }
    }

    public static void main(String args[]) {
        Point3D o1 = new Point3D(5, 5, 5);
        Point3D o2 = new Point3D(10, 10, 10);

        System.out.println("Object 1 distance " + o1.distance());
        System.out.println("Object 1 distance " + o2.distance());
    }
}
