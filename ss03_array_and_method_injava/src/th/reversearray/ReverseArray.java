package th.reversearray;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Size does not exceed 20");
            }
        }while (size > 20);
        array = new int[size];
        int i=0;
        while (i<array.length){
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i]= scanner.nextInt();
            i++;
        }
        System.out.printf("%-20%s", "Elements in array: ","");
        for (int j=0;j<array.length/2;j++){
            
        }
    }
}