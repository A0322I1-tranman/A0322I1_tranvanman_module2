package LoopinJava.th.interestcalculator;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interstRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of month: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interstRate = input.nextDouble();
        double totalInterest = 0;
        for (int i=0;i<month;i++){
            totalInterest += money*(interstRate/100)/12*100;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
