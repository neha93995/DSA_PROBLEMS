import java.util.Arrays;

public class HistogramMaxArea {
    public static int largestRectangleArea(int[] heights) {

        int prevWidth[]  = new int[heights.length];
        int nextWidth[] = new int[heights.length];

        int prevMin = -1;

        for(int i=0; i<prevWidth.length; i++)
        {
            for(int j = 0; j<i; j++)
            {
                System.out.println(prevMin);
                if(prevMin==-1 || heights[prevMin]>heights[j])
                {
                    prevMin = i;
                    // prevMin = prevMin;
                }
                
            }

            prevWidth[i] = prevMin;
        }
        
        System.out.println(Arrays.toString(prevWidth));

        return 0;
        
    }
    public static void main(String[] args) {
        
        int arr[] = {4,2,1,5,6,3,2,4,2,-1};
        int result = largestRectangleArea(arr);
        // System.out.println(result);

        System.out.println(2==2);
        System.out.println(2.1234568==2.1234567);

    }
}
