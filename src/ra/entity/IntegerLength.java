package ra.entity;

public class IntegerLength{
    int minLength;
    int maxLength;

    public IntegerLength(int minLength, int maxLength){
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    public int getMinLength(){
        return minLength;
    }

    public int getMaxLength(){
        return maxLength;
    }
}
