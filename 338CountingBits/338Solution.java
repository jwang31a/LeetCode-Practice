class Solution {
    public static int[] countBits(int n) {
        //bits acts as sort of a memo 
        //(dynamic programming since information about a simpler problem is stored there)
        //bits needs to be initialized b/c otherwise there won't be anything there
        //compared to an array of just 0s
        //n + 1 necessary b/c we want # of 1s in binary representation of 0 - n, which requires n + 1 spots
        int[] bits = new int[n + 1];
        if (n == 0) {
            return bits;
        }
        bits[0] = 0;
        if (n >= 1) {
            bits[1] = 1;
        }

        for (int i = 0; i <= n; i++) {
            //updating bits here gives information on a previous, simpler problem
            if (i % 2 == 0) {
                //if the number is even, then that number divided by 2 has the same number of 1s
                bits[i] = bits[i / 2];
            } else {
                //if number is odd, number divided by 2 (integer division) is missing the rightmost 1
                bits[i] = bits[i / 2] + 1;
            }
        }

        return bits;
    }

    public static void main(String[] args) {
        int[] upTo8 = countBits(8);
        System.out.println(upTo8);
    }
}