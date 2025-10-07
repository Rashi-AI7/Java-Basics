class lowerbound {
    public int[] searchRange(int[] nums, int target) {
    //     int first = -1, last = -1;
    //     int n = nums.length; 
    //     for(int i=0; i<n; i++){
    //         if(nums[i] == target){
    //             if(first == -1){
    //                 first = i;
    //             }else{
    //                 last = i;
    //             }
    //         }
    //     }
    //     return new int[]{first, last};
    // }
    int first = lowerBound(nums, target, nums.length);
    int last = upperBound(nums, target, nums.length)-1;
        if(first == nums.length || nums[first] != target) 
        return new int[]{-1, -1};
        return new int[]{first, last};
    }

private static int lowerBound(int[] arr, int x, int n) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    private static int upperBound(int[] arr, int x, int n) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
}
