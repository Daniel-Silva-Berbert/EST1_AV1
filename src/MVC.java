public class MVC {
    public static long mdc(int x, int y){
        if(x == 0 || y == 0){
            return -1;
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
