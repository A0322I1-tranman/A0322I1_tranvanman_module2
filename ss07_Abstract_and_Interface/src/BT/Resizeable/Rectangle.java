package BT.Resizeable;

public class Rectangle extends Shape implements Resizeable{
    private  double width = 1.0;
    private  double height = 1.0;

    @Override
    public void resize(double percent) {
       setWidth(getWidth()+(getWidth()*percent/100));
       setHeight(getHeight()+(getHeight()*percent/100));
    }
    public Rectangle(){}
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +" subclass "+super.toString()+
                '}';
    }
}
