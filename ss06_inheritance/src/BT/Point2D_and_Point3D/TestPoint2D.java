package BT.Point2D_and_Point3D;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        System.out.println(p1.getXY()[0]+","+p1.getXY()[1]);
        p1.setXY(2,5);
        System.out.println(p1);
        Point2D p2 = new Point2D(3,5);
        System.out.println(p2.toString());
        Point3D p3 = new Point3D();
        System.out.println(p3);
        Point3D p4 = new Point3D(1,2,5);
        System.out.println(p4);
    }
}
