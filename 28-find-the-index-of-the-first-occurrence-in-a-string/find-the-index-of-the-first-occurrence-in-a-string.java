class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        int h=0;
      for(int i=0;i<m;i++){
        h+=(needle.charAt(i)-'a'+1);
      }
      for(int i=0;i<=n-m;i++){
           int hs=0;
           for(int j=0;j<m;j++){
                hs+=(haystack.charAt(i+j)-'a'+1);
           } 
      if(h==hs){
        int j=0;
        for( j=0;j<m;j++){
        if(haystack.charAt(i+j)!=needle.charAt(j)){
            break;
        }
      }
      if(j==m){

        return i;
      }
      }
      }

    return -1;

    }
}
    