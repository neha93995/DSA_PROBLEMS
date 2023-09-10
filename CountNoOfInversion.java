import java.util.Arrays;

public class CountNoOfInversion {

    public static int countInversion(int arr[], int l, int r)
    {
        int count=0;
        if(l<r)
        {
            int mid = l+(r-l)/2;

            count += countInversion(arr, l,mid);
            count += countInversion(arr, mid+1, r);

            count += mergeProcedure(arr, l, mid, r);
        }
        return count;
    }

    public static int mergeProcedure(int arr[], int l, int mid, int r)
    {
        int i, j, k;

        int left[] = Arrays.copyOfRange(arr, l, mid+1);
        int right[] = Arrays.copyOfRange(arr, mid+1, r+1);

        i=0;
        j=0;
        k=l;

        int swap=0;
        while(i<left.length && j<right.length)
        {
            if(left[i]<=right[j])
            {
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
                swap += mid+1-(l+i); // doubt how it is working 
            }
        }

        // add remaining element

        while(i<left.length)
        {
            arr[k++]=left[i++];
        }

        while(j<right.length)
        {
            arr[k++] = right[j++];
        }

        return swap;

    }


    public static void main(String[] args) {
        
        int arr[] = {1,5,2,8,3,4};

        int count = countInversion(arr, 0 , arr.length-1);
        System.out.println(count);
    }
}
