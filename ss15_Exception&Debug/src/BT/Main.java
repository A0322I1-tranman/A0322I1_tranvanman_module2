package BT;

import javax.imageio.IIOException;
import java.util.Scanner;

public class Main {
    public static void checkRightTriangle(int a, int b, int c) throws  IllegalTriangleException{
        int check =1;
        if (a<0||b<0||c<0){
            check = 0;
            throw new IllegalTriangleException("Không hợp lệ");
        }
        if (a+c<b||a+b<c||b+c<a){
            check =0;
            throw new IllegalTriangleException("Không thỏa mãn");
        }
        if (check==1){
            System.out.println("Tam giác hợp lệ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập a = ");
            int inp1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập b = ");
            int inp2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập c = ");
            int inp3 = Integer.parseInt(scanner.nextLine());
            checkRightTriangle(inp1,inp2,inp3);
        }catch (IllegalTriangleException er){
            System.out.println("Exception "  + er.getMessage());
        }
    }
}
