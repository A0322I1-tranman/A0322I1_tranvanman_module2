package BT.Triangle;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        Triangle triangle1 = new Triangle(1,2,3,"red",false);
        System.out.println(triangle1.toString());
    }

}
