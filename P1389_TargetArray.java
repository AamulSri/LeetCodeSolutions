

import java.util.ArrayList;
import java.util.List;

class P1389_TargetArray{
   public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<Integer>();
        int size = nums.length;
        int[] target = new int[size];
        for(int i=0;i<size;i++){
            list.add(index[i],nums[i]);
        }
    
        for(int i=0;i<size;i++){
            target[i]=list.get(i);
        }
        return target;
    }
}