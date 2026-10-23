import java.util.LinkedHashSet;
class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer>st=new LinkedHashSet<>();
        for(int x:nums){
            st.add(x);
            }
        int i=0;
        for(int x:st){
            nums[i++]=x;
        }
        int k=st.size();
        return k;
    }
}