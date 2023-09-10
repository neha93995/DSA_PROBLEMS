import java.util.Arrays;

public class MargeSort {
    
    public static void mergeSort(int arr[], int l, int r)
    {
        if(l<r)
        {
            // divide the array into two subproblem

            int mid = l+(r-l)/2;

            //conqure the subproblem using recursion
            // leftsubarray
            mergeSort(arr, l, mid);

            // rightsubarray
            mergeSort(arr, mid+1,r);

            //combine the solution of all subproblem
            mergeProcedure(arr, l, mid, r);
            System.out.println(Arrays.toString(arr));

        }
    }

    public static void mergeProcedure(int arr[], int l, int mid, int r)
    {

        int i,j,k;

        // length of the subarray

        int n1 = mid-l+1;
        int n2 = r-mid;

        // initialize two subarray 

        int left[] = new int[n1];
        int right[] = new int[n2];

        //copy the data to left and right subarray

        for(i=0; i<n1; i++)
        {
            left[i] = arr[l+i];
        }

        for(j=0; j<n2; j++)
        {
            right[j] = arr[mid+1+j];
        }

        // comparison between the left and right subarray

        i = 0;
        j = 0;
        k = l;

        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {
                arr[k] = left[i++];
            }
            else{
                arr[k] = right[j++];
            }
            k++;
        }

        // copy the remaining element to the array

        while(i<n1)
        {
            arr[k++] = left[i++]; 
            
        }

        while(j<n2)
        {
            arr[k++]= right[j++];
        }

    
    }

    public static void main(String[] args) {
        
        int arr[] = {9,8,7,6,5,4,3,2,1};

        System.out.println("Before sorting "+Arrays.toString(arr));

        mergeSort(arr, 0, arr.length-1);

        System.out.println("After sorting "+Arrays.toString(arr));


    }
}
