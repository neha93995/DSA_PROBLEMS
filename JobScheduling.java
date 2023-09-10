import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class ScheduleJob{

    char id;
    int deadline, profit;

    public ScheduleJob(){}
    
    public ScheduleJob(char id, int deadline, int profit)
    {
        this.id = id;
        this.deadline = deadline;
        this.profit  = profit;
    }

    void printJobSequence(ArrayList<ScheduleJob> arr, int maxDeadline)
    {
        int n = arr.size();


        Collections.sort(arr, (a,b)->b.profit-a.profit);
         
        boolean result[]=  new boolean[maxDeadline];
        char jobs[] = new char[maxDeadline];

        for(int i=0; i<n; i++)
        {
            for(int j=Math.min(maxDeadline-1,arr.get(i).deadline-1); j>=0; j--)
            {
                if(result[j]==false)
                {
                    result[j]= true;
                    jobs[j] = arr.get(i).id;
                    break;
                }
            }
        }

        for(char id: jobs)
        {
            System.out.print(id+" ");
        }
    }




}

public class JobScheduling {
    public static void main(String[] args) {
        
        ArrayList<ScheduleJob> arr = new ArrayList<>();
        arr.add(new ScheduleJob('1', 5, 55)); 
        arr.add(new ScheduleJob('2', 2, 65)); 
        arr.add(new ScheduleJob('3', 7, 75)); 
        arr.add(new ScheduleJob('4', 3, 60)); 
        arr.add(new ScheduleJob('5', 2, 70)); 
        arr.add(new ScheduleJob('6', 1, 50)); 
        arr.add(new ScheduleJob('7', 4, 85)); 
        arr.add(new ScheduleJob('8', 5, 68)); 
        arr.add(new ScheduleJob('9', 3, 45)); 

        ScheduleJob job = new ScheduleJob();
        job.printJobSequence(arr, 7);

    }
}
