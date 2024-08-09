import java.util.HashSet;

class Solution {
    public static int singleNumber(int[] nums) {
        int runningXor = 0;
        for (int num : nums) {
            runningXor ^= num;
        }
        return runningXor;
    }

    public static void main(String[] args) {
        int[] missing4 = {1, 1, 2, 2, 4};
        int[] missing20 = {1, 1, 5, 5, 20};

        System.out.println(singleNumber(missing4));
        System.out.println(singleNumber(missing20));
    }
}