package BT.Resizeable;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;
    @Override
    public void resize(double percent){
      setRadius(getRadius()+(getRadius()*percent/100));
    }
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +" subclass of"+super.toString()+
                '}';
    }
}
