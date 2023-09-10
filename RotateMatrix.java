import java.util.Arrays;

public class RotateMatrix {

    static int[][] rotate(int nums[][]){

        int m =nums.length;
        int n = nums[0].length;

        // step 1 - for transpose

        for(int i=0; i<m; i++)
        {
            for(int j=i; j<n; j++)
            {
                int temp = nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }

        // step 2 - change columns

        for(int i=0; i< m; i++)
        {
            int li= 0;
            int ri = n-1;

            while(li<ri)
            {
                int temp = nums[i][li];
                nums[i][li]  = nums[i][ri];
                nums[i][ri] = temp;
                li++;
                ri--;
                
            }
        }
        


        return nums;
    } 
    public static void main(String[] args) {
        
        int nums[][] = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}

        };

        nums = rotate(nums);

        for(int i=0; i<nums.length; i++)
        {
            System.out.println(Arrays.toString(nums[i]));
        }



    }
}
