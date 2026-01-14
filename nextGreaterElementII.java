import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        Arrays.fill(res, -1);
        Stack <Integer> st = new Stack<>();
        for(int i=0; i<=2*n; i++){
            int idx = i%n;
            while(!st.empty() && nums[idx]>nums[st.peek()]){
                res[st.pop()] = nums[idx];
            }
            if(i<n){
                st.push(idx);
            }
        }
        return res;
    }
}

