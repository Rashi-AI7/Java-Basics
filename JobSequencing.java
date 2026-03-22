import java.util.*;

class JobSequencing {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        class Job{
            int deadline;
            int profit;
            
            Job(int d, int p){
                deadline=d;
                profit=p;
            }
        }
       
       int n=deadline.length;
       Job jobs[] = new Job[n];
       
       for(int i=0; i<n; i++){
           jobs[i] = new Job(deadline[i], profit[i]);
       }
       
       Arrays.sort(jobs, (a, b) -> b.profit-a.profit);
       int max=0;
       for(int i=0; i<n; i++){
           max=Math.max(max, deadline[i]);
       }
       boolean slot[] = new boolean[max];
       ArrayList<Integer> ans = new ArrayList<>();
       int totalProfit=0, count=0;
       for(int i=0; i<n; i++){
           for(int j=jobs[i].deadline-1; j>=0; j--){
               if(!slot[j]){
                slot[j]=true;
                totalProfit+=jobs[i].profit;
                count++;
                break;
       }
           }
       }
       ans.add(count);
       ans.add(totalProfit);
       return ans;
       
    }
}
