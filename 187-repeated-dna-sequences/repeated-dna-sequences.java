class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans=new ArrayList<>();
        Set<String> a=new HashSet<>();
        Set<String> b=new HashSet<>();
        int n=s.length();
        for(int i=0;i<=n-10;i++){
           String d=s.substring(i,i+10);
            if(a.contains(d)){
                if(b.add(d)){
                    ans.add(d);
                }
            }
            else{
                a.add(d);
            }

           
        }
        return ans;

    }
}