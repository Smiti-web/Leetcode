class Solution {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int ans=0;
        while(low<=high){
             int mid=low+(high-low)/2;
             if(nums[mid]>=nums[low] && nums[mid]>=nums[high]){
                ans=mid;
                low++;
                high--;
             }
             else if(nums[mid]>=nums[low]){
                low++;
             }
             else{
                high--;
             }
        }
        return ans;
    }
}