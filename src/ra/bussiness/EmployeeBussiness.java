package ra.bussiness;

import ra.entity.Employee;
import ra.entity.IntegerLength;
import ra.validate.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeBussiness{
    public static int MAX_EMPLOYEE = 100;
    public static List<Employee> employees = new ArrayList<>();

    public static void displayEmployees(){
        if(employees.isEmpty()){
            System.out.println("Employee list is empty");
            return;
        }
        System.out.println("Employee list:");
        employees.forEach(Employee::displayData);
    }

    public static void addEmployee(Scanner sc){
        if(employees.size() == MAX_EMPLOYEE){
            System.out.println("Employee list is full");
            return;
        }
        int amounts = AmountStudentValidator.amountStudentaValidator(sc, "Enter amount of employee would you like to add: ", new IntegerLength(0, MAX_EMPLOYEE - employees.size()));
        for(int i = 0; i < amounts; i++){
            Employee newEmployee = new Employee();
            newEmployee.inputData(sc);
            employees.add(newEmployee);
            System.out.println();
        }
        System.out.println("Employee added successfully");
    }

    public static void updateEmployee(Scanner sc){
        if(employees.isEmpty()){
            System.out.println("Employee list is empty");
            return;
        }
        System.out.println("Employee list:");
        employees.forEach(e -> System.out.println("ID: " + e.getEmployeeId() + "| Name: " + e.getEmployeeName()));
        System.out.println("Enter Employee ID: ");
        String id = sc.nextLine();
        int found = -1;
        for(int i = 0; i < employees.size(); i++){
            if(id.equals(employees.get(i).getEmployeeId())){
                found = i;
            }
        }
        if(found == -1){
            System.out.println("Employee not found");
            return;
        }
        Employee foundEmployee = employees.get(found);
        while(true){
            updateMenu();
            int choice;
            try{
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Invalid choice");
                continue;
            }
            switch(choice){
                case 0:
                    System.out.println("Returning to the main menu");
                    System.exit(0);
                case 1:
                    foundEmployee.setEmployeeName(StringValidator.validateString(sc, "Enter new employee name: "));
                    break;
                case 2:
                    foundEmployee.setBirthday(EmployeeValidator.validateEmmployeeString(sc, "Enter new birthday: ", "\\d{4}-\\d{2}-\\d{2}"));
                    break;
                case 3:
                    foundEmployee.setPhoneNumber(EmployeeValidator.validateEmmployeeString(sc, "Enter new phone number: ", "(083|039|038|037|036|035|034|091|098)\\d{10}"));
                    break;
                case 4:
                    foundEmployee.setSex(BooleanValidator.validateBoolean(sc, "Enter new sex: "));
                    break;
                case 5:
                    foundEmployee.setCoefficient(FloatValidator.validateFloat(sc, "Enter new coefficient"));
                    break;
                case 6:
                    foundEmployee.setAllowanceSalary(IntegerValidator.validateInt(sc, "Enter new allowance salary"));
                    break;
                case 7:
                    foundEmployee.setDepartment(StringValidator.validateString(sc, "Enter new department: "));
                    break;
                case 8:
                    foundEmployee.setStatus(ByteValidator.byteValidator(sc, "Enter new status (1, 2 or 3): "));
                    break;
            }
        }
    }

    public static void updateMenu(){
        System.out.println("Menu");
        System.out.println("1. Employee Name");
        System.out.println("2. Employee Birthday");
        System.out.println("3. Employee Phone Number");
        System.out.println("4. Employee Sex");
        System.out.println("5. Employee Coefficient");
        System.out.println("6. Employee Allowance Salary");
        System.out.println("7. Employee Department");
        System.out.println("8. Employee Status");
        System.out.println("0. Exit");
    }

    public static void deleteMenu(){
        if(employees.isEmpty()){
            System.out.println("Employee list is empty");
            return;
        }

    }
}
