import java.util.*;

class P217_ContainsDuplicate{
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums){
       HashSet<Integer> dups = new HashSet<Integer>();
        for (int n : nums) {
            if (dups.contains(n)) {
                return true;
            }
            dups.add(n);
        }
        return false;
    }
}
