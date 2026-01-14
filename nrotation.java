class nrotation {
    public int findKRotation(int[] nums) {
        int low = 0, high = nums.length-1;
        int ans = Integer.MIN_VALUE;
        int index = -1;
        while(low<=high){
            if(nums[low] < nums[high]){
                index = low;
                ans = nums[low];
            }
            int mid = (low+high)/2;
            if(nums[mid]<nums[low]){
                if(nums[mid]<ans){
                    index = mid;
                    ans = nums[mid];
                }high = mid-1;
            }else //nums[mid]>=nums[low]
            { if(nums[mid]<ans){
                index = mid;
                ans = nums[mid];
            }low = mid+1;
            }
        }
    return index;
    }
}

