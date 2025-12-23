import java.util.*;

class p18_4Sum {
    public static void main(String args[]){
        int arr[] = new int[]{1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> result = fourSum(arr,target);
        for(int i =0 ; i< result.size() ; i++){
        System.out.println(result.get(i).toString());
        }
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 1;
        int j = nums.length -1; 
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        while(i>=0 && j>=0 && i<j){
        for(int ptr = 0 ; ptr<nums.length;ptr++){
              
              int temp = nums[i] + nums[j]+nums[ptr];
              int sum  = target - temp;
              int index =list.indexOf(sum);
              if(index!=i && index!=j && index!=ptr && list.contains(sum) && temp!=target){
                List<Integer> inter = new ArrayList();
                    inter.add(nums[i]);
                    inter.add(nums[j]);
                    inter.add(nums[ptr]);
                    inter.add(nums[index]);
                    i++;
                    j--;
                    res.add(inter);
              } 
               
        }
    }
        return res;
    }
}