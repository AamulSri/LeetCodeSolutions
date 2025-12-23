public class P485_MaxConsecutiveOne {
    
    public static void main(String args[]){
        int arr[] = new int[]{1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));

    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count =0;
        for(int i =0 ; i< nums.length ; i++){
            if(nums[i]==1){
                count ++;
                if(max<count){
                max = count ;
            }
            }
            else {
            
            count = 0;
            }
        }
        return max;
    }
    
}
