package ra.validate;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EmployeeValidator{
    public static Set<String> uniqueId = new HashSet<>();

    public static String validateEmmployeeString(Scanner sc, String message, String regex){
        while(true){
            try{
                System.out.print(message);
                String newString = sc.nextLine();
                if(newString.trim().isEmpty()){
                    throw new IllegalArgumentException("Birthday can't be empty");
                }
                if(!newString.trim().matches(regex)){
                    throw new IllegalArgumentException("Input is invalid");
                }
                return newString;
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static String validateEmployeeId(Scanner sc, String message, String regex){
        while(true){
            try{
                System.out.print(message);
                String newString = sc.nextLine();
                if(newString.trim().isEmpty()){
                    throw new IllegalArgumentException("Birthday can't be empty");
                }
                if(!newString.trim().matches(regex)){
                    throw new IllegalArgumentException("ID is invalid");
                }
                if(uniqueId.contains(newString)){
                    throw new IllegalArgumentException("ID is already exists");
                }
                return newString;
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
