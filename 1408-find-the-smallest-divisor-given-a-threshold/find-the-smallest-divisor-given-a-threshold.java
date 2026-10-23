class Solution {
    public int smallestDivisor(int[] nums, int threshold){
        int n=nums.length;
        int low=1;
        int high=0;
        int ans=-1;
        for(int k=0;k<n;k++){
            high=Math.max(high,nums[k]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int i=0;
            int s=0;
            while(i<n){
            int d=(nums[i]+mid-1)/mid;
            s+=d;
            i++;
        }
        if(s<=threshold){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        }
        return ans;
    }
}