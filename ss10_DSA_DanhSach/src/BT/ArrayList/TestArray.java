package BT.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
public class TestArray {
    public static void main(String[] args) {
        MyList<Integer> myList= new MyList<Integer>();
        myList.add(2);
        myList.add(4);
        myList.add(6);
        myList.add(8);
        System.out.println(myList);
        myList.add(2,4523);
        System.out.println(myList);
        MyList<Integer> newList = myList.clone();
        System.out.println(newList);
    }
}
