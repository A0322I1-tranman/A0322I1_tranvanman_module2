package BT.Point_MoveablePoint;

public class Point {
    private float x;
    private float y;
     public  Point(){
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public Point(float x, float y){
         this.x = x;
         this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
         float[] XY = {getX(),getY()};
         return XY;
    }
    public void setXY(float X, float Y){
       this.x = X;
       this.y = Y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                '}';
    }
}
