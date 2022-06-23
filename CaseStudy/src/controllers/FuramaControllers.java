package controllers;
import java.util.Scanner;
public class FuramaControllers {
     public static Scanner input = new Scanner(System.in);
    public static int displayMainmenu() {



            System.out.println("Menu: ");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter your number: ");
            int choice = input.nextInt();
            return choice;
    }
    public static int EmployeeManagement() {
        System.out.println("Employee Management: ");
        System.out.println("1. Display list employee");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Return main menu");
        System.out.println("Enter your number: ");
        int choice = input.nextInt();
        return choice;
    }
    public static int CustomerManagement(){
        System.out.println("Customer Management: ");
        System.out.println("1. Display list Customers");
        System.out.println("2. Add new customers");
        System.out.println("3. Edit customers");
        System.out.println("4. Return main menu");
        System.out.println("Enter your number: ");
        int choice = input.nextInt();
        return choice;
    }
    public static int FacilityManagement(){
        System.out.println("Facility Management: ");
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Return main menu");
        System.out.println("Enter your number: ");
        int choice = input.nextInt();
        return choice;
    }
    public static int BookingManagement(){
        System.out.println("Booking Management: ");
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new constracts");
        System.out.println("4. Display list constracts");
        System.out.println("5. Edit constracts");
        System.out.println("6. Return main menu");
        System.out.println("Enter your number: ");
        int choice = input.nextInt();
        return choice;
    }
    public static int PromotionManagement(){
        System.out.println("Promotion Management: ");
        System.out.println("1. Display list Customers user service");
        System.out.println("2. Display list customers");
        System.out.println("3. Return main menu");
        System.out.println("Enter your number: ");
        int choice = input.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        int choice = -1,choose;
        do {
            System.out.println("Enter your number: ");
            choose = displayMainmenu();
            switch (choose){
                case 1:
                    choice = EmployeeManagement();
                    break;
                case 2:
                    choice = CustomerManagement();
                    break;
                case 3:
                    choice = FacilityManagement();
                    break;
                case 4:
                    choice = BookingManagement();
                    break;
                case 5:
                    choice = PromotionManagement();
                    break;
                case 6:
                    System.out.println("End Menu");
                    break;
            }

        }while (choose!=6);
    }
        }




