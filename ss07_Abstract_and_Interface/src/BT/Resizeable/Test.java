package BT.Resizeable;
import java.util.Random;
public class Test {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[4];
        shapes[0] = new Rectangle(3,1);
        shapes[1] = new Circle(5,"yellow",true);
        shapes[2] = new Rectangle(2,4);
        shapes[3] = new Square(5);
        Random random1 = new Random();
        for (Shape shape:shapes){
            int ranM = random1.nextInt(100)+1;
            System.out.println("Percent up shape is ");
            shape.resize(ranM);
            System.out.println("After up " + ranM + " % shape have" );
            System.out.println(shape.toString());
            System.out.println("-------");
        }

    }
}
