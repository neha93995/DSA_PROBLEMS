public class Pelindrome{
    public static void main(String[] args) {
        

        int arr[] = {1,2,3,3,2,1,};

        int flag =0;

        for(int i=0; i<(arr.length)/2; i++)
        {
            if(arr[i]!=arr[arr.length-1-i])
            {
                flag =1;
            }
        }
        
        if(flag==0)
        {
            System.out.println("Pelindrome");
        }
        else{
            System.out.println("not a pelindrome");
        }
    }
}