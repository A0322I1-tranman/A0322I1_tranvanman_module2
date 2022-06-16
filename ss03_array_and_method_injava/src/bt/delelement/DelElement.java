package bt.delelement;
import java.util.Scanner;
public class DelElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your num: ");
        int num = input.nextInt();
        int index = 0;
        int[] arr = {7,6,5,4,9,2,0};
        for (int i=0;i<arr.length;i++){
            if (arr[i]==num){
                System.out.println("Element: " + i);
                index = i;
                break;
            }
        }
        for (;index<arr.length-1;index++){
            arr[index] = arr[index+1];
        }
        for (int element : arr){
            System.out.println(element + " ");
        }
    }
}
