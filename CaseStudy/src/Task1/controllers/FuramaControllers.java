package Task1.controllers;
import Task2.models.Level;
import Task2.models.Official;
import Task2.services.EmployeeServiceImpl;
import Task2.models.Employee;

import java.util.Scanner;

import static Task1.controllers.FuramaControllers.enterNewEmployee;

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
        int choose,choice=-1;
        do {
            choose = displayMainmenu();
            choose(choose);
        }while (choose!=6);
    }
    public static void choose(int choose){
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        do {
            System.out.println("Enter your number: ");
            choose = displayMainmenu();
            switch (choose){
                case 1:
                    do {
                        choice = EmployeeManagement();
                        if (choice==1){
                            employeeService.showEmployee();
                        }else if (choice==2){
                            Employee newEmployee = enterNewEmployee(scanner,scannerStr);
                             employeeService.addEmployee(newEmployee);
                        }
                    }while (choice!=4);
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
    }     public static Employee enterNewEmployee(Scanner scanner, Scanner scannerstr) {
        System.out.println("Enter code ID for new Employee");
        int code = scanner.nextInt();
        System.out.println("Enter name for new Employee");
        String name = scannerstr.nextLine();
        System.out.println("Enter Date of birth for new Employee");
        int date = scanner.nextInt();
        System.out.println("Enter CMND for new Employee");
        int CMND = scanner.nextInt();
        System.out.println("Enter email for new Employee");
        String email = scannerstr.nextLine();
        System.out.println("Enter level for new Employee");
        Level[] level = Level.values();
        System.out.println("Enter gender for new Employee with (true: men/ false: women");
        boolean gender= scanner.nextBoolean();
        System.out.println("Enter SDT for new Employee:");
        int sdt = scanner.nextInt();
        System.out.println("Enter position for new Employee: ");
        String position = scannerstr.nextLine();
        System.out.println("Enter office for new Employee");
        Official[] officials = Official.values();
        System.out.println("Enter salary for new Employee");
        double salary = scanner.nextDouble();
        return new Employee(name,date,gender,CMND,sdt,email,code,level,position,officials,salary);
    }
        }




