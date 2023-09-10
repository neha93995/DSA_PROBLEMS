import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,65,4,2};

        // ---------first approach----------

        // for(int i=0; i<arr.length; i++)
        // {
        //     for(int j=i+1; j<arr.length; j++)
        //     {
        //         if(arr[i]==arr[j])
        //         {
        //             System.out.println("duplicate no. is : "+arr[i]);
        //         }
        //     }
        // }

        // -----------------second approach-----

        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println("duplicate no. is : "+arr[i]);
            }
        }
    }
}
