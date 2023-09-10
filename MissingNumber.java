public class MissingNumber {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,7,8};
        int n = arr.length;

        int sumOfNaturalNum = ((n+1)*(n+2))/2;
        int sumOfArrayElem =0;

        for(int i=0; i<n; i++)
        {
            sumOfArrayElem += arr[i];
        }


        //  for(int i=0; i<=n/2; i++)
        // {
        //     if(i==n/2)
        //     {
        //         sumOfArrayElem += arr[i];
        //     }
        //     else{
        //         sumOfArrayElem += arr[i]+arr[n-1-i];
        //     }
        // }

        int missingNo = sumOfNaturalNum-sumOfArrayElem;
        System.out.println("missing no. is : "+missingNo);
    }
}
