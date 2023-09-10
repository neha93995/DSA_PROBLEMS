import java.util.HashMap;

public class CoinChange {


     public static long count(int coins[], int N, int sum) {
        
        int count = 0;
        HashMap hm = new HashMap();
        
        for(int i=0; i<N; i++)
        {
            hm.put(coins[i],coins[i]);
        }
        
        
        
        for(int i=0; i<N; i++)
       {
           int temp = sum;
           
           while(temp>0)
           {
               temp = temp-coins[i];
               if(hm.containsKey(temp))
               {
                   count++;
                }
               
           }
        //    hm.remove(coins[i]);
       }
       
       
        return count;
        
    }


    public static void main(String[] args) {

        System.out.println(count(new int[]{2,5,3,6},4,10));
        
    }
}
