package BT.Point_MoveablePoint;

public class Test {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2,3,4,1.5f);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
        moveablePoint.move();
        System.out.println(moveablePoint.getSpeed()[0]);
    }
}

