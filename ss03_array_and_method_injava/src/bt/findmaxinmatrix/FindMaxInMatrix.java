package bt.findmaxinmatrix;
import java.util.Scanner;
public class FindMaxInMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số hàng cho ma trận");
        int a1 = input.nextInt();
        System.out.println("Nhập số dòng cho ma trận");
        int a2 = input.nextInt();
        int[][] arr = new int[a1][a2];
        System.out.println("Nhập các phần tử của ma trận: ");
        for (int i=0;i<a1;i++){
            for (int j=0;j<a2;j++){
                System.out.println("arr["+i+"]["+j+"]");
                arr[i][j]=input.nextInt();
            }
        }
        int max=arr[0][0];
        for (int i=0;i<a1;i++){
            for (int j=0;j<a2;j++){
                if (max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max trong ma trận là: "+ max);
    }
}
