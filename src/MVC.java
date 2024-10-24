public class MVC {
    public static long mdc(int x, int y){
        if(x == 0 || y == 0){
            throw new IllegalArgumentException("O número não pode ser zero.");
        }else{
            if(x >= y && x % y == 0){
                return y;
            }else if(x < y){
                return mdc(y,x);
            }else{
                return mdc(y, x% y);
            }
        }
    }
}