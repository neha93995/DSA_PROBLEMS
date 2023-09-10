public class TilingProblem {
    public static int tilingWays(int n)
    {

        if(n<=3)
        {
            return n;
        }
        else{
            return tilingWays(n-1)+tilingWays(n-2);
        }

    }
    public static void main(String[] args) {
        
        int n=5;
        System.out.println(tilingWays(n));
    }
}
