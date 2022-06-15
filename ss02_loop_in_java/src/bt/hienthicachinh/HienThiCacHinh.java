package bt.hienthicachinh;
import java.util.Scanner;
public class HienThiCacHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice !=0){
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Draw the rectangle: ");
                    for (int i=0 ; i<3 ; i++) {
                        for (int j=0 ; j<5 ; j++) {
                            System.out.printf(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Draw the square triangle");
                      for (int i=1;i<=5;i++){
                          for (int j=1;j<=i;j++){
                              System.out.printf("* ");
                          }
                          System.out.printf("\n");
                      }
                    System.out.println("\n-----\n");
                      for (int i=5;i>=1;i--){
                          for (int j=1;j<=i;j++){
                              System.out.printf("* ");
                          }
                          System.out.printf("\n");
                      }
                    System.out.println("\n-----\n");
                      for (int i = 1;i<=5;i++){
                          for (int j=1;j<=5-i;j++){
                              System.out.printf(" ");
                              System.out.printf(" ");
                          }
                          for (int k=1;k<=i;k++){
                              System.out.printf("* ");
                          }
                          System.out.printf("\n");
                      }
                    System.out.println("\n-----\n");
                      for (int i=5;i>=1;i--){
                          for (int z=5-i;z>=1;z--){
                              System.out.printf(" ");
                              System.out.printf(" ");
                          }
                          for (int j=1;j<=i;j++){
                              System.out.printf("* ");
                          }
                          System.out.printf("\n");
                      }
                case 3:
                    System.out.println("Draw isosceles triangle");
                    for (int i=1;i<=5;i++){
                        for (int j=5-i;j>=1;j--){
                            System.out.printf(" ");
                        }
                        for (int k=1;k<=i;k++){
                            System.out.printf("* ");
                        }
                        System.out.printf("\n");
                    }
            }
        }
    }
}
