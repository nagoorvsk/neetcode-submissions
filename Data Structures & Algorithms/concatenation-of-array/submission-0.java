class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[2 * nums.length];
        int prevIndex = nums.length;

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i + prevIndex] = nums[i];
        }

        return result;
    }
}