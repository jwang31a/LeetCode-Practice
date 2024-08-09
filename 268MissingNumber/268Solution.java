class Solution {
        public static int missingNumber(int[] nums) {
            int ans = 0;
            int n = nums.length;
            int tri = n * (n + 1) / 2;
            for (int num : nums) {
                ans += num;
            }
            return tri - ans;
        }

    public static void main(String[] args) {
        int[] missing1 = {2, 4, 6, 8, 3, 5, 7, 9, 0};
        int[] missing5 = {0, 1, 2, 3, 4, 6, 7, 8, 9};

        System.out.println(missingNumber(missing1));
        System.out.println(missingNumber(missing5));
    }
}