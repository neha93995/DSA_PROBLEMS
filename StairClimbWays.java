public class StairClimbWays {

    public static int findWays(int a)
    {
        if(a<=1)
        {
            return a;
        }
        else{
            return findWays(a-1)+findWays(a-2);
        }
    }
    public static void main(String[] args) {
        
        int a = 5;
        System.out.println(findWays(a+1));
    }
}


// Time complexity = O(2^n)  expontial complexity
// Space Complexity = O(n)
