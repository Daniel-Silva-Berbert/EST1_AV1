public class Calculadora {
    public static long N2(int n){
        if(n < 0)
        {
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }
        else{
            if(n == 0)
                return 1;
            else{ 
                if(n == 1)
                    return n;
                else
                    return N2(n-1, 2);
            }
        }
    }

    private static long N2(int n, int total){
        if(n == 0)
            return total;
        else{
            return N2(n-1, total * 2);
        }
    }
}
