package BT.Optional.DecimalToBinary;
import java.util.Scanner;
import java.util.Stack;
public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> myStack=new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:" );
        int decimal = scanner.nextInt();
        int temp = decimal;
        do {
            myStack.push(temp%2);
            temp /=2;
        }while (temp!=0);
        System.out.println("Số thập phân: " +decimal+" chuyển qua hệ nhị phân là: ");
        while (!myStack.empty()){
            System.out.println(myStack.pop());
        }
    }

}
