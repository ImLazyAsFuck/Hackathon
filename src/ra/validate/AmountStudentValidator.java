package ra.validate;

import ra.entity.IntegerLength;

import java.util.Scanner;

public class AmountStudentValidator{
    public static int amountStudentaValidator(Scanner sc, String message, IntegerLength length){
        while(true){
            try{
                System.out.print("Enter amount of students you would like to add: ");
                int amount = Integer.parseInt(sc.nextLine());
                if(amount <= length.getMinLength()){
                    throw new IllegalArgumentException("Amount must be greater than 0");
                }
                if(amount > length.getMaxLength()){
                    throw new IllegalArgumentException("Amount must be less than " + length.getMaxLength());
                }
                return amount;
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    };
}
