public class Primo {
    public static boolean isPrimo(int n){
        if(n < 0){
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }else{
            if(n == 1){
                return false;
            }
            else{
                return isPrimo(n, n - 1);
            }
        }
    }

    private static boolean isPrimo(int n, int n2){
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
