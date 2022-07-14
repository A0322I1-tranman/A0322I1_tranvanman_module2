package BT.Optional.Palindrome;
import java.util.Stack;
import java.util.Scanner;
public class PaStack {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi: ");
        Scanner scanner = new Scanner(System.in);
        String inpStr = scanner.nextLine();
        Stack stack = new Stack();
        for (int i=0;i<inpStr.length();i++){
            stack.push(inpStr.charAt(i));
        }
        String reverseStr="";
        while (!stack.empty()){
            reverseStr = reverseStr+stack.pop();
        }
        if (inpStr.equals(reverseStr)){
            System.out.println("Chuỗi đối xứng");
        }else {
            System.out.println("Chuỗi không đối xứng");
        }
    }
}
