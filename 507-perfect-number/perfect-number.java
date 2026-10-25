class Solution {
    public boolean checkPerfectNumber(int num) {
        int i=1;
        long sm=0;
        while(i<num){
            if(num%i==0){
               sm+=i;
               i++;
            }
            else{
                i++;
            }
        }
        if(sm==num){
                return true;
               }
        return false;
    }
}