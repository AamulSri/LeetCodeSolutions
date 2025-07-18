public class P238_Product_of_Array_Except_Self {
     public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0]=1;
        ans[nums.length -1] =1;
        int product =1;
        for(int i =1; i< nums.length ; i++){
            ans[i] = nums[i-1]*ans[i-1];
        }
        for(int j=nums.length-2;j>=0;j--){
            product*= nums[j+1];
            ans[j]*= product;
        }
            
        return ans;
    }
}
