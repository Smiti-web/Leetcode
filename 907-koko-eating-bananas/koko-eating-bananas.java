class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int maxi=0;
        for(int i=0;i<piles.length;i++){
           maxi=Math.max(maxi,piles[i]);
        }
        int high=maxi;
        int ans=maxi;
        while(low<=high){
            int mid=low+(high-low)/2;
            long thr=0;
            for(int i=0;i<piles.length;i++){
               long hr=(piles[i]+mid-1)/mid;
               thr+=hr;
                } 
            if(thr<=h){
                ans= mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
return ans;
    }
}