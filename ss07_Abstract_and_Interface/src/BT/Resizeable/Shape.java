package BT.Resizeable;

public class Shape implements Resizeable{
    private String color = "yellow";
    private boolean filled = true;

    @Override
    public void resize(double percent) {
    }
    public Shape(){
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + getColor() + '\'' +
                ", filled=" + (isFilled() ? "filled":"not filled") +
                '}';
    }
}
