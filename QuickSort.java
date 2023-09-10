import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int arr[], int l, int r)
    {
        if(l<r)
        {
            //divide the array into subarray
            int m = partition(arr, l, r);

            // conquer the subproblem
            quickSort(arr, l, m-1);
            quickSort(arr, m+1, r);

        }
    }

    public static int partition(int arr[], int l, int r)
    {
        int i=l;

        // pivot as the first element of the an array
        int pivot = arr[i];

        for(int j=l+1; j<=r; j++ )
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
            }
        }

        // to return the correct index of pivot element

        int temp=arr[l];
        arr[l]  =arr[i];
        arr[i] = temp;



        return i;
    }
    public static void main(String[] args) {
        
        int arr[] = {8,7,6,5,4,3,3,2};

        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
