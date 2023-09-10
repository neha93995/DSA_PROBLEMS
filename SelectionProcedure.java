import java.util.Arrays;

public class SelectionProcedure {

    public static int selectionProcedure(int arr[], int l, int r, int k)
    {
        
    
            int m = partition(arr, l,r);
    
            if(m==k-1)
            {
                return arr[m];
            }
            else if(m<k-1)
            {
                return selectionProcedure(arr, m+1, r, k);
                
            }
            else{
                return selectionProcedure(arr, l, m-1, k);
            }

       
        
    }


    public static int partition(int arr[], int l, int  r)
    {

        int i=l;
        int pivot = arr[l];

        for(int j=l+1; j<=r; j++)
        {
            if(arr[j]>=pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i];
        arr[i] = arr[l];
        arr[l] = temp;



        return i;

    }


    public static void main(String[] args) {
        
        int arr[] = {5,4,7,3,8,1};
        int k=5;
        int kthElement = selectionProcedure(arr,0,arr.length-1, k);
        System.out.println(kthElement);
        System.out.println(Arrays.toString(arr));
    }
}
