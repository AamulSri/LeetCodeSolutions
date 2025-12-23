import java.util.*;
public class P283_MoveZeros {
    public static void main(String agrs[]){
            moveZeroes(new int[]{0,1,0,3,12});
    }
      public static void moveZeroes(int[] nums) {
       int j =-1; 
       int n = nums.length;
       for( int i =0 ;i< n ;i++ ){
        if(nums[i]==0){
            j=i;
            break;
        }
       }
       if(j!=-1){
        for(int i =j+1; i< n; i++){
            if(nums[j]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
       }
        System.out.println(Arrays.toString(nums));
        }
}
