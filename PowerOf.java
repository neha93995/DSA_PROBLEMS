public class PowerOf {

    public static long powerOf(int a, int b)
    {
        long result=0;
        long finalResult=0;
        if(b==1)
        {
            return a;
        }
        else{
            int mid = b/2;
            result = powerOf(a,mid);
            finalResult = result*result;
            if(b%2==0)
            {
                return finalResult;
            }
            else{
                return a*finalResult;
            }

        }
    }

    public static void main(String[] args) {
        
        int a =2;
        int b=32;

        System.out.println(powerOf(a, b));

    }
}


//  Time Compelexity = O(log2n)
//   space complexity = O(n)