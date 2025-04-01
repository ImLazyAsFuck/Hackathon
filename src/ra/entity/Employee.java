package ra.entity;

import ra.validate.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Employee implements IApp{
    static float BASE_SALARY = 1800000;
    private String employeeId;
    private String employeeName;
    private String birthday;
    private String phoneNumber;
    private boolean sex;
    private float coefficient;
    private int allowanceSalary;
    private String department;
    private byte status;

    public Employee(){
    }

    public Employee(String employeeId, String employeeName, String birthday, String phoneNumber, boolean sex, float coefficient, int allowanceSalary, String department, byte status){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.coefficient = coefficient;
        this.allowanceSalary = allowanceSalary;
        this.department = department;
        this.status = status;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public String getBirthday(){
        return birthday;
    }

    public void setBirthday(String birthday){
        this.birthday = birthday;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public boolean isSex(){
        return sex;
    }

    public void setSex(boolean sex){
        this.sex = sex;
    }

    public float getCoefficient(){
        return coefficient;
    }

    public void setCoefficient(float coefficient){
        this.coefficient = coefficient;
    }

    public int getAllowanceSalary(){
        return allowanceSalary;
    }

    public void setAllowanceSalary(int allowanceSalary){
        this.allowanceSalary = allowanceSalary;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public byte getStatus(){
        return status;
    }

    public void setStatus(byte status){
        this.status = status;
    }

    @Override
    public void inputData(Scanner sc){
        this.employeeId = inputEmployeeId(sc);
        this.employeeName = inputEmployeeName(sc);
        this.birthday = inputBirthday(sc);
        this.phoneNumber = inputPhoneNumber(sc);
        this.sex = inputSex(sc);
        this.coefficient = inputCoefficient(sc);
        this.allowanceSalary = inputAllowanceSalary(sc);
        this.department = inputDepartment(sc);
        this.status = 1;
    }

    private String inputPhoneNumber(Scanner sc){
        return EmployeeValidator.validateEmmployeeString(sc, "Enter phone number: ", "(083|039|038|037|036|035|034|091|098)\\d{10}");
    }

    private String inputBirthday(Scanner sc){
        return EmployeeValidator.validateEmmployeeString(sc, "Enter Birthday: ", "\\d{4}-\\d{2}-\\d{2}");
    }

    private String inputDepartment(Scanner sc){
        return StringValidator.validateString(sc, "Enter department: ");
    }

    private int inputAllowanceSalary(Scanner sc){
        return IntegerValidator.validateInt(sc, "Enter allowance salary: ");
    }

    private float inputCoefficient(Scanner sc){
        return FloatValidator.validateFloat(sc, "Enter the coefficient: ");
    }

    private boolean inputSex(Scanner sc){
        return BooleanValidator.validateBoolean(sc, "Enter sex (true for male or false for female): ");
    }

    private String inputEmployeeName(Scanner sc){
        return StringValidator.validateString(sc, "Enter Employee Name: ");
    }

    private String inputEmployeeId(Scanner sc){
        return EmployeeValidator.validateEmployeeId(sc, "Enter Employee Id: ", "NV\\d{4}");
    }

    @Override
    public void displayData(){
        float totalSalary = BASE_SALARY * this.allowanceSalary + this.coefficient;
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Birthday: " + birthday);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Sex: " + (this.sex? "Male" : "Female"));
        System.out.println("Coefficient: " + coefficient);
        System.out.println("Allowance Salary: " + allowanceSalary);
        System.out.println("Department: " + department);
        System.out.println("Status: " + status);
        System.out.println("Total Salary: " + totalSalary);
    }
}
