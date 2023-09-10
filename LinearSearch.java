public class LinearSearch {
    public static void main(String[] args) {
        
        int arr[] = {1,3,4,6,9,14,16,23,56};
        int target = 23;

        int index =-1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==target)
            {
                index = i;
                break;
            }
        }
        if(index>=0)
        {
            System.out.println("element is present at index : "+index);
        }
        else{
            System.out.println("element is not present in the array ");
        }
    }
}
