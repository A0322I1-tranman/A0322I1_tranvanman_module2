package bt.findmininarr;
import java.util.Scanner;
public class FindMinInARR {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int size;
     int[] arr;
     int index;
     do {
         System.out.println("Enter a size: ");
         size = scanner.nextInt();
         if (size>20){
             System.out.println("Size does not exceed 20");
         }
     }while (size>20);
     arr = new int[size];
     int i=0;
     while (i<arr.length){
         System.out.println("Enter element " + i + ": ");
         arr[i]=scanner.nextInt();
         i++;
     }
        System.out.printf("%-20s%s","Elements in arr: "," ");
     for (int j=0;j<arr.length;j++){
         System.out.println(arr[j] + "\t");
     }
       int min = arr[0];
     for (int j=0;j<size;j++){
         if (min>arr[j]){
             min = arr[j];
         }
     }
     for (int k=0;k<size;k++){
         System.out.println(arr[k] + " ");
     }
        System.out.println("\n Min in arr: " + min);
    }
}
