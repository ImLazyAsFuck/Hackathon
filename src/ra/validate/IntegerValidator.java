package ra.validate;

import java.util.Scanner;

public class IntegerValidator{
    public static int validateInt(Scanner sc, String message){
        while(true){
            try{
                System.out.print(message);
                int integer = Integer.parseInt(sc.nextLine());
                if(integer < 0){
                    throw new IllegalArgumentException("Integer must be greater than zero");
                }
                return integer;
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
