class Solution {
  public int maxArea(int[] height) {

  int i = 0 , j =height.length-1,ans=0,res=0;

  while(i<j){
        if(height[i]<=height[j]){
          res = height[i]*(j-i);
          i++;
        }
        else{
          res = height[j]*(j-i);
          j--;
        }
        if(ans<res){
          ans = res;
        }

  }
      return ans;

}
}