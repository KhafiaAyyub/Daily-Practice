class Solution {
    public int dominantIndex(int[] nums) {
      int index = 0, max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
        index = i;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (i == index) continue;
      if (((long) nums[i] * 2) > max) {
        return -1;
      }
    }
    return index;
  }  
}

