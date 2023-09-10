import java.util.Arrays;
import java.util.Comparator;

public class FractionKnapsack {

    public static double getMaxValue(double arr[][], double capacity)
    {
        
        // Arrays.sort(arr,(a,b)->(int)(b[0]/b[1]-a[0]/a[1]));

        Arrays.sort(arr,(a,b)->{
            double r1= a[0]/a[1];
            double r2= b[0]/b[1];
            if(r1<r2)
            {
                return 1;
            }
            else{
                return -1;
            }
        });


       for(int i=0; i<arr.length; i++)
       {
         System.out.println(Arrays.toString(arr[i]));
       }


       double totalProfit = 0;

       for(int i=0; i<arr.length; i++)
       {
            double weight = arr[i][1];
            double profit = arr[i][0];


           if(capacity-weight>0)
           {
                capacity = capacity-weight;
                totalProfit += profit;
            }
            else{
                double fraction = capacity/weight;
                totalProfit += profit*fraction;
                capacity -= weight*fraction;
                break;
            }
       }
        return totalProfit;
    }

    public static void main(String[] args) {
        
        double arr[][] = {{25,5},{75,10},{100,12},{50,4},{45,7},{90,9},{30,3}};
        double capacity = 37;

        double maxValue = getMaxValue(arr,capacity); 
        System.out.println(maxValue);
    }
}

// import java.lang.*;
// import java.util.Arrays;
// import java.util.Comparator;
 
// // Greedy approach
// public class FractionKnapsack {
     
//     // Function to get maximum value
//     private static double getMaxValue(ItemValue[] arr,
//                                       int capacity)
//     {
//         // 1. Sorting items by profit/weight ratio;
//         Arrays.sort(arr, new Comparator<ItemValue>() {
//             @Override
//             public int compare(ItemValue item1,
//                                ItemValue item2)
//             {
//                 double cpr1 = Double.valueOf(item1.profit/item1.weight);
//                 double cpr2 = Double.valueOf(item2.profit/item2.weight);
     
//                 if (cpr1 < cpr2)
//                     return 1;
//                 else
//                     return -1;
//             }
//         });
 
//         double totalValue = 0;
 
//         for (ItemValue i : arr) {
 
//             int curWt = (int)i.weight;
//             int curProfit = (int)i.profit;
 
//             if (capacity - curWt >= 0) {
 
//                 // This weight can be picked whole
//                 capacity = capacity - curWt;
//                 totalValue += curProfit;
//             }
//             else {
 
//                 // Item cant be picked whole
//                 double fraction
//                     = ((double)capacity / (double)curWt);
//                 totalValue += (curProfit * fraction);
//                 capacity
//                     = (int)(capacity - (curWt * fraction));
//                 break;
//             }
//         }
 
//         return totalValue;
//     }
 
//     // Item value class
//     static class ItemValue {
 
//         int profit, weight;
 
//         // Item value function
//         public ItemValue(int profit, int wt)
//         {
//             this.weight = wt;
//             this.profit = profit;
//         }
//     }
 
//     // Driver code
//     public static void main(String[] args)
//     {
 
//         ItemValue[] arr = { new ItemValue(25, 5),
//                             new ItemValue(75, 10),
//                             new ItemValue(100, 12),
//                             new ItemValue(50, 4),
//                             new ItemValue(45, 7),
//                             new ItemValue(90, 9),
//                             new ItemValue(30, 3)

//                         };
 
//         int capacity = 37;

//         //function calling                
//         double maxValue = getMaxValue(arr, capacity);
 
//         // Function call
//         System.out.println("Maximum Profit is: "+maxValue);
//     }
// }