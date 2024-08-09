import java.util.HashMap;

class Solution {
    //using memoization, so i have to pass the memo into the function for all the information to be passed down
    public static int climbStairs(int n) {
        HashMap<Integer, Integer> steps = new HashMap<Integer, Integer>();
        return climbStairs(n, steps);
    }
    
    public static int climbStairs(int n, HashMap<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!memo.keySet().contains(n)) {
            //pretty much the recursive step
            int step1 = climbStairs(n - 1, memo);
            int step2 = climbStairs(n - 2, memo);
            memo.put(n, step1 + step2);
        }
        return memo.get(n);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(22));
    }
}