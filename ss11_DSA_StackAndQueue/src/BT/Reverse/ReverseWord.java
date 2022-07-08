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
        System.out.println(wStack);
        for (int j=0;j<wStack.size();j++){
            temp = wStack.pop();
            mStack.push(temp);
            System.out.println(temp);
        }
        System.out.println(mStack);
    }
}
