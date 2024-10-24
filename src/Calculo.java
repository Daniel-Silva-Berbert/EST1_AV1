public class Calculo {
    public static long fibonacci(int numero ){
        if(numero < 0)
            throw new IllegalArgumentException("O número não pode ser negativo.");
        else{
            if(numero == 0)
            {
                return 0;
            }else{
                long result = 1;
                long resultAnte = 1;
                for(int i = 1; i < numero; i++){
                    resultAnte = result - resultAnte;
                    result += resultAnte;
                }
                return result;
            }
        }
    }
    
    public static long fatorial ( int numero ) {
        if(numero < 0)
            throw new IllegalArgumentException("O número não pode ser negativo.");
        else{
            long total = 1;
            for(int i = numero; i > 1; i--){
                total *= i;
            }
            return total;
        }
    }
        
}
