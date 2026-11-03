class Solution {
    public boolean possible(int[] bloomDay,int day,int m,int k){
         int cn=0;
         int nob=0;
         for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                cn++;
            }
            else{
                nob+=(cn/k);
                cn=0;
            }
         }
         nob+=(cn/k);
         if(nob>=m){
            return true;
         }
         return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int maxi=0;
        int mini=0;
        if(bloomDay.length<(m*k)){
            return -1;
        }
        for(int i=0;i<bloomDay.length;i++){
            maxi=Math.max(maxi,bloomDay[i]);
            mini=Math.min(mini,bloomDay[i]);
        }
        int low=mini;
        int high=maxi;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(bloomDay,mid,m,k)==true){
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