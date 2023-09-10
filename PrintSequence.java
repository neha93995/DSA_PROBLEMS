import java.util.ArrayList;

public class PrintSequence {
    public static void printSequence(int arr[], int index, ArrayList<Integer> al)
    {
        if(index==arr.length)
        {
            if(al.size()>0)
            {
                System.out.println(al);
            }
            return;
        }
        else{

            printSequence(arr, index+1, al);
            al.add(arr[index]);

            printSequence(arr, index+1, al);
            al.remove(al.size()-1);
        }
    }
    public static void main(String[] args) {
     
        int arr[] = {1,2,3};
        int index = 0;
        ArrayList<Integer> al = new ArrayList<>();

        printSequence(arr, index, al);
    }
}
