public class SomarMulti {
    public static long somarMulti(int x, int y)
    {
        if(y < 0)
        {
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }
        else{
            if(y == 1){
                return x;
            }
            else{
                return x + somarMulti(x, y-1);
            }
        }
    }
}
