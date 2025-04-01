package ra.validate;

import java.util.Scanner;

public class StringValidator{
    public static String validateString(Scanner sc, String message){
        while(true){
            try{
                System.out.print(message);
                String s = sc.nextLine();
                if(s.trim().isEmpty()){
                    throw new IllegalArgumentException("Can't be empty");
                }
                return s;
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
