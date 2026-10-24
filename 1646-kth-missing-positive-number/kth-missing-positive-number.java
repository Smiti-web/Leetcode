class Solution {
    public int findKthPositive(int[] arr, int k){
        int n=arr.length;
       int low=1;
       int cn=0;
       int i=0;
       while(true){
        if(i<n && low!=arr[i]){
            cn++;
            if(cn==k){
                return low;
            }
            low++;
        }
        else if(i<n){
            i++;
            low++;
        }
        else{
            cn++;
            if(cn==k){
                return low;
            }
            low++;
        }
       }

    }
}