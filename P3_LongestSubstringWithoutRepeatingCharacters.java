public class P3_LongestSubstringWithoutRepeatingCharacters {
 
     public static int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int st=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            for(int j=st;j<i;j++){
                if(s.charAt(j)==ch){
                    st=j+1;
                    break;
                }
            }
            maxlen=Math.max(maxlen,i-st+1);
        }
        return maxlen;
    }
    public static void main(String args[]){
     
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
