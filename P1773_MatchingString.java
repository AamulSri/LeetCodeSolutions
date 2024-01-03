import java.util.List;

public class P1773_MatchingString {
   public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
	       int j=-1;
	       int count =0;
	       if(ruleKey.equals("type"))
	            j=0;
	        else if(ruleKey.equals("color"))
	            j=1;
	        else if(ruleKey.equals("name")) 
	            j=2;
	        
	        for(int i=0; i<items.size();i++){
	        	List<String> slist = items.get(i);
	        	if(slist.get(j).equalsIgnoreCase(ruleValue)) {
	        		count+=1;
	        }
	        }
	        return count;
	    }
}
