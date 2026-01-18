public class subarraySum {
    public static int longestSubarray(int[] arr, int k){
        int n = arr.length;
        int left = 0, right=0, sum=arr[0];
        int maxlength = 0;
        while(right<n){
        
        while(left<=right && sum>k){
            sum-=arr[left];
            left++;
        }
        if(sum==k){
            maxlength = Math.max(maxlength, right-left+1);
            // return maxlength;
        }
        right++;
        if(right<n){
            sum+=arr[right];
        }
    }
        
        return maxlength;
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(longestSubarray(arr, k));
    }
}
