package BT.Reverse;
import java.util.Stack;
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> wstack = new Stack<>();
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        System.out.println(stack);
        int temp, loop = stack.size();
        for (int i=0;i<loop;i++){
            temp = stack.pop();
            wstack.push(temp);
            System.out.println(temp);
        }
        System.out.println(wstack);

    }
}
