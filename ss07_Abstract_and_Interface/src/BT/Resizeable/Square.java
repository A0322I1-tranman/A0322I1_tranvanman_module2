package BT.Resizeable;

public class Square extends Shape implements Resizeable {
    private double side = 1.0;
    @Override
    public void resize(double percent){
       setSide(getSide()+(getSide()*percent/100));
    }
    public Square(){
    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getPerimeter(){
        return this.side*4;
    }
    public double getArea(){
        return Math.pow(this.side,2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +" subclass of "+super.toString()+
                '}';
    }
}
