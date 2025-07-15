import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class P49_GroupAnargram {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
   

        for(String s : strs){
                char[] c = s.toCharArray();
                Arrays.sort(c);
                String sortedStrs = String.valueOf(c);
                
              if(!map.containsKey(sortedStrs)){
                map.put(sortedStrs,new ArrayList<>());

                 }
                 map.get(sortedStrs).add(s);
                
        }
            return new ArrayList(map.values());
    

}
}
