class Solution {
    public int mySqrt(int x) {
        int low=1;
        int high=x;
        long s=0;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            s=(long)mid*mid;
            if(s==x){
                return mid;
            }
            else if(s>x){
                high=mid-1;
            }
            else{
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }
}