public class SomarMulti {
    public static long somarMulti(int x, int y)
    {
        if(y == 1){
            return x;
        }else if(y < 0){
            y * -1;
            return (x + somarMulti(x, y-1))*-1;
        }
        else{
            return x + somarMulti(x, y-1);
        }
    }
}
