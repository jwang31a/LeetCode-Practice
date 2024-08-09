class NumArray {
    private int[] prefixSum;

    //since we want to get the sum of the numbers in the array from a left index to right index
    //we can use a prefix sum to pre calculate the sums in the range
    public NumArray(int[] nums) {
        prefixSum = nums;
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] += prefixSum[i - 1];
        }
    }
    
    //if the range starts from 0, we just give the prefix sum of the right index
    //since the left index doesn't have any relevant values
    //otherwise, we do right - (left - 1)
    //the offset of the left index needs to happen in order to include the index
    //in the original num array
    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefixSum[right];
        }
        return prefixSum[right] - prefixSum[left - 1];
    }

    public int[] getPrefix() {
        return prefixSum;
    }

    public static void main(String[] args) {
        int[] numArray = {-2, 0, 3, -5, 2, -1};
        NumArray test = new NumArray(numArray);
        int[] testPrefix = test.getPrefix();
        for (int i = 0; i < testPrefix.length; i++) {
            System.out.println(testPrefix[i]);
        }
        // System.out.println(test.sumRange(0,2));
    }
}