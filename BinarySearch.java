public class BinarySearch {
    public static int binarySearch(int arr[], int target)
    {
        int i=0; 
        int j= arr.length-1;
        int mid=0;

        while(i<=j)
        {
            mid = (i+j)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                j= mid-1;
            }
            else
            {
                i = mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,34,5,6,8,9,12,17};
        int target = 9;

        int index = binarySearch(arr, target);
        System.out.println("element is present at index : " +index);
        
    }
}
