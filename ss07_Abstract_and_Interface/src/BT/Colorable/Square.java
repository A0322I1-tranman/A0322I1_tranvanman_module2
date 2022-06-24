package BT.Colorable;

import BT.Resizeable.Shape;

public class Square extends Shape implements Colorable {
    private double side;
    @Override
    public void howToColor(){
        System.out.println("Color all four side");
    }
    public Square(){}
    public Square(double side){
        this.side = side;
    }
    public Square (double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public double getPerimeter(){
        return this.side*4;
    }
    public double getArea(){
        return Math.pow(this.side,2);
    }



    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +" subclass of "+super.toString()+
                '}';
    }
}
