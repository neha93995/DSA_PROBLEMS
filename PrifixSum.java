import java.util.Arrays;
import java.util.Scanner;

public class PrifixSum {



    public static void prefixSum2(int arr[][])
    {
        // -------------------prefix sum according to row -----------
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=1; j<arr.length; j++)
            {
                arr[i][j]=arr[i][j]+arr[i][j-1];
            }
        }
        
        // -------------------prefix sum according to column -----------

        for(int j=0; j<arr.length; j++)
        {
            for(int i=1; i<arr.length; i++)
            {
                arr[i][j] += arr[i-1][j];
            }
        }

        
    }


    static int prefixSumResult(int arr[][], int r1, int c1, int r2, int c2)
    {

        int totalSum = 0,left=0, up=0, repeatedOrigin =0, result =0;

        totalSum = arr[r2][c2];
        
        if(r1!=0)
        {
            up = arr[r1-1][c2];
        }
        if(c1!=0)
        {
            left = arr[r2][c1-1];
        }
        if(r1!=0 && c1!=0)
        {
            repeatedOrigin = arr[r1-1][c1-1];
        }

        result = totalSum-left-up+repeatedOrigin;

        return result;
    }





    public static int prefixSum1(int arr[][], int r1, int c1, int r2, int c2)
    {
        int sum=0;
        for(int i=r1; i<r2; i++)
        {
            for(int j=c1; j<c2; j++)
            {
                sum +=arr[i][j];
            }
        }


        return sum;
    }


    public static void main(String[] args) {
        System.out.println("size of matrix (m*n)");
        Scanner sc = new Scanner(System.in);

        int m =sc.nextInt();
        int n =sc.nextInt();

        int arr[][] = new int[m][n];
        System.out.println("enter matrix element ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println("enter r1 : ");
        int r1 = sc.nextInt();
        
        System.out.println("enter c1 : ");
        int c1 = sc.nextInt();

        System.out.println("enter r2 : ");
        int r2 = sc.nextInt();

        System.out.println("enter c2 : ");
        int c2 = sc.nextInt();


        // -----------brute force approach--------------

        // int result = prefixSum1(arr,r1,c1,r2,c2);
        // System.out.println(result);

        // -----------optimized approach--------------

        prefixSum2(arr);
        int result= prefixSumResult(arr,r1,c1,r2,c2);

        System.out.println("result : "+result);
        for(int i=0; i<arr.length; i++)
        {
           System.out.println(Arrays.toString(arr[i]));
        }

    }
}
