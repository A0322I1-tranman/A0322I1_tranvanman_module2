package BT.Colorable;

import BT.Resizeable.Shape;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square();
        shapes[1] = new Square(4);
        for (Shape shape:shapes){
            System.out.println(shape.toString());
            if (shape instanceof Square){
                Colorable colorable = new Square();
                colorable.howToColor();
            }
            System.out.println("----");
        }
    }
}
