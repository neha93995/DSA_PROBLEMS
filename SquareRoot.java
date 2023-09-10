public class SquareRoot {
    
    public static int modifiedBinarySearch(int n)
    {
        
        int low =0;
        int high =n;
        int result = -1;
        
        while(low<=high)
        {
            // to avoid overflow
            int mid = low + (high-low)/2;
            if(mid*mid == n)
            {
                 return mid;
            }
            else if(mid*mid>n)
            {
                high = mid-1;

            }
            else 
            {
                low = mid+1;
                result = mid;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
        System.out.println("Square root of a number");

        int n =8;

        System.out.println("square root is " + modifiedBinarySearch(n));
        System.out.println("dfasdf");

    }
}
