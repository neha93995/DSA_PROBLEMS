import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            boolean swaped = false;
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;
                }
            }
            if(!swaped)
            {
                break;
            }
        }
    }
    public static void main(String[] args) {
     
        int arr[] = {10,43,8,76,456,88,90,35};
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
