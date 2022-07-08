package BT.Reverse;
import java.util.Stack;
public class ReverseWord {
    public static void main(String[] args) {
        String str = "hoang lan anh";
        Stack<String> wStack = new Stack<>();
        Stack<String> mStack = new Stack<>();


        String[] arr = str.split(" ");
        for (int i=0;i<arr.length;i++){
            wStack.push(arr[i]);

        }
        String temp;
        int loop = wStack.size();
        for (int j=0;j<loop;j++){
            temp = wStack.pop();
            mStack.push(temp);
            System.out.println(temp);
        }
        System.out.println(mStack);
        System.out.println(wStack);
    }
}
