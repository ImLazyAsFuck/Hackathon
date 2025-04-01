package ra.validate;

import java.util.Scanner;

public class FloatValidator{
    public static float validateFloat(Scanner sc, String message){
        while(true){
            try{
                System.out.print(message);
                float newFloat = Float.parseFloat(sc.nextLine());
                if(newFloat < 0){
                    throw new IllegalArgumentException("Float should be greater than zero");
                }
                return newFloat;
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
