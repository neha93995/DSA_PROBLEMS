import java.util.*;

public class Permutation {

    public static void backtrack(int[] nums, List<List<Integer>> al, ArrayList<Integer> tempArr, boolean[] visited)
    {
         if(tempArr.size()==nums.length)
        {
            al.add(new ArrayList<>(tempArr));
            return;
        }

        for(int i=0; i<nums.length; i++)
        {
            if(visited[i])
            {
                continue;
            }
            tempArr.add(nums[i]);
            visited[i]=true;

            backtrack(nums, al, tempArr, visited);
            tempArr.remove(tempArr.size()-1);
            visited[i] =false;
        }
    }
    
    
    public static List<List<Integer>> permute(int[] arr) {
        
        
        
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        boolean visited[] = new boolean[arr.length];
        backtrack(arr,al,new ArrayList<Integer>(), visited);
        
        return al;
        
    }
    
    public static void main(String[] args) {

        int arr[] = {1,2,3};
        System.out.println(permute(arr));

        
        
    }
}
