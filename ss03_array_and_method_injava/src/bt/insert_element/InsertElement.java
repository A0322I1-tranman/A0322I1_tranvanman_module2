package bt.insert_element;
import java.util.Scanner;
public class InsertElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your num: ");
        int num = input.nextInt();
        int index;
        int[] arr = {5,4,8,3,6,7,12,25};
        do {
            System.out.println("Nhập ví trí cần chèn: ");
            index = input.nextInt();
        }while (index>arr.length||index<0);
        for (int i=arr.length-1;i>index;i--){
          arr[i]=arr[i-1];
        }
        arr[index]=num;
        for (int element : arr){
            System.out.println(element + " ");
        }
    }
}
