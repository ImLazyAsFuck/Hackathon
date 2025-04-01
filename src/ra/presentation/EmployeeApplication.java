package ra.presentation;

import ra.bussiness.EmployeeBussiness;

import java.util.Scanner;

public class EmployeeApplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            displaymenu();
            try{
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Enter a valid number");
                continue;
            }
            switch(choice){
                case 0:
                    System.out.println("Goodbye!");
                    System.exit(0);
                case 1:
                    EmployeeBussiness.displayEmployees();
                    break;
                case 2:
                    EmployeeBussiness.addEmployee(sc);
                    break;
                case 3:
                    EmployeeBussiness.updateEmployee(sc);
                    break;
                case 4:
                    
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }
    }

    public static void displaymenu(){
        System.out.println("Menu");
        System.out.println("1. Display Employees");
        System.out.println("2. Add Employee");
        System.out.println("3. Update Employee");
        System.out.println("4. Delete Employee");
        System.out.println("5. Search Employee");
        System.out.println("6. Sort Employees");
        System.out.println("0. Exit");
    }
}
