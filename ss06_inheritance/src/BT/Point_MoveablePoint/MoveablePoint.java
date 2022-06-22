package BT.Point_MoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint(){
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed =xSpeed;
        this.ySpeed =ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arr = {getxSpeed(),getySpeed()};
        return arr;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +"x"+ getX()+ "y" + getY()+
                '}';
    }
    public void move(){
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
    }
}
