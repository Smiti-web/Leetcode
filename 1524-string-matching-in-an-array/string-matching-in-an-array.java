class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans=new ArrayList<>();
        int s=words.length;
        for(int i=0;i<s;i++){
            for(int k=0;k<s;k++){
                if(i!=k && words[k].contains(words[i])){
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }
}