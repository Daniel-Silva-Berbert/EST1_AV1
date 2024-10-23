public class Primo {
    public static boolean isPrimo(int n){
        if(n < 1){
            return false;
        }
        else{
            return isPrimo(n, n - 1);
        }
    }

    public static boolean isPrimo(int n, int n2){
        if(n2 == 1)
            return true;
        else{
            if(n % n2 == 0){
                return false;
            }
            else{
                return isPrimo(n, n2 -1);
            }
        }
    }
}
