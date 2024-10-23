public class SomarMulti {
    public static long somarMulti(int x, int y)
    {
        if(y == 1){
            return x;
        }
        else{
            return x + somarMulti(x, y-1);
        }
    }
}
