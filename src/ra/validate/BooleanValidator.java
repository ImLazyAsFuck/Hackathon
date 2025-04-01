package ra.validate;

import java.util.Scanner;

public class BooleanValidator{
    public static boolean validateBoolean(Scanner sc, String message){
        while(true){
            try{
                System.out.print(message);
                String newBoolean = sc.nextLine();
                if(newBoolean.trim().isEmpty()){
                    throw new IllegalArgumentException("Input can't be empty");
                }
                if(newBoolean.trim().equalsIgnoreCase("true") || newBoolean.trim().equalsIgnoreCase("false")){
                    return Boolean.parseBoolean(newBoolean);
                }
                throw new IllegalArgumentException("Input is invalid");
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
