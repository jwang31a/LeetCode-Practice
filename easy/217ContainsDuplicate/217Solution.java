import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (dict.containsKey(num) && dict.get(num) >= 1) {
                return true;
                //dict.put(num, dict.get(num) + 1);
            } 
            else {
                dict.put(num, 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nodupe = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] dupe = {1, 1, 2, 2};

        System.out.println(containsDuplicate(nodupe));
        System.out.println(containsDuplicate(dupe));
    }
}