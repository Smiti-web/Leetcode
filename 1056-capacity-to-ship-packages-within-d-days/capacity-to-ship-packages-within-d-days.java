class Solution {
    public int reqDays(int[] weights, int capacity){
        int day=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>capacity){
                day=day+1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxi=0;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            maxi=Math.max(weights[i],maxi);
            sum+=weights[i];
        }
        int low=maxi;
        int high=sum;
        int ans=0;
        while(low<=high){
             int mid=low+(high-low)/2;
             int reqdays=reqDays(weights,mid);
             if(reqdays<=days){
                high=mid-1;
                ans=mid;
             }
             else{
                low=mid+1;
             }
        }
        return ans;
    }
}