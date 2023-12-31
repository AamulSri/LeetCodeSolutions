import java.util.*;

class P1313_Decompress {
  public int[] decompressRLElist(int[] nums) {
      List<Integer> res = new ArrayList<Integer>();
  for(int i=0;i<nums.length;i+=2)
    for(int f =0; f<nums[i];f++) {
      res.add(nums[i+1]);
    }
  int[] result = res.stream().mapToInt(Integer :: intValue).toArray();	
  return result;

  }

}