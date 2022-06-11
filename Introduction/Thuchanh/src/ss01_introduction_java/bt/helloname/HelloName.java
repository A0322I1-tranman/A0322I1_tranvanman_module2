package ss01_introduction_java.bt.helloname;
import java.util.Scanner;
public class HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello: "+name);
    }
}
