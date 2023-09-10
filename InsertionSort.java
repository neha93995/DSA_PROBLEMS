import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp  = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    
    public static void main(String[] args) {
        
        int arr[] = {2,7,3,9,1,3,0};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
