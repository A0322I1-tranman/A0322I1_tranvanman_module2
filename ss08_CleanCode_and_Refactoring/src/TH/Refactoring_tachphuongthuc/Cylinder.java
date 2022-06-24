package TH.Refactoring_tachphuongthuc;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter*height+2*baseArea;
        return volume;
    }
    private static double getPerimeter(int radius){
        return 2*Math.PI*radius;
    }
    private static double getBaseArea(int radius){
        return Math.pow(radius,2)*Math.PI;
    }

    public static void main(String[] args) {
        System.out.println(getVolume(4,5));
    }
}
