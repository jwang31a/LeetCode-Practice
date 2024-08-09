import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int num : nums) {
            //in place modification for O(n) runtime without extra space other than extra space for return
            //if the number is positive, use that number as an index and set the number at index - 1 negative
            //that way, all the numbers that are in the array will have a corresponding negative number at index - 1
            //and all numbers that don't exist in the array will not give a negative index
            int index = Math.abs(num);
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }
        }
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                //we don't want the actual number at the index
                //we want the index itself, which will give the numbers that are missing
                ret.add(i + 1);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] missing5_6 = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(missing5_6));
    }
}