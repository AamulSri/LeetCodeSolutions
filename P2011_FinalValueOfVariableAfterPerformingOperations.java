public class P2011_FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x=0, n = operations.length;
        for(int i =0;i<n;i++){
            if(operations[i].equalsIgnoreCase("X++"))
                 x++;
            else if(operations[i].equalsIgnoreCase("X--"))
                 x--;
            else if(operations[i].equalsIgnoreCase("++X"))
                 ++x;
            else if(operations[i].equalsIgnoreCase("--X"))
                 --x;    
                
            }
            return(x);
        }
        
    }

