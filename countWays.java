import java.util.*;

public class countWays {
    public static int waysMemo(int n, int ways[]){
        if(n==0) return 1;
        if(n<0) return 0;
        if(ways[n]!=-1){
            return ways[n];
        }
        ways[n]=waysMemo(n-1, ways)+waysMemo(n-2, ways);
        return ways[n];
    }

    public static int waysTab(int n, int dp[]){
        dp[0]=1;
        dp[1]=1;
        for(int i=2; i<=n; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args){
        int n=5;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(waysMemo(n, dp));
        System.out.println(waysTab(n, dp));
    }
}
