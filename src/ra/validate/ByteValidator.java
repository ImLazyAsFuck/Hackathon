package ra.validate;

import java.util.Scanner;

public class ByteValidator{
    public static byte byteValidator(Scanner sc, String message){
        while(true){
            try{
                String input = sc.nextLine();
                if(input.trim().isEmpty()){
                    return 1;
                }
                if(input.trim().matches("1") || input.trim().matches("2") || input.trim().matches("3")){
                    return Byte.parseByte(input);
                }
                throw new IllegalArgumentException("Invalid Byte");
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
