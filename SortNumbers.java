public class SortNumbers {
  
  public int[] sort(int[] nums) {
    while(!isSorted(nums)) {
      nextPermutation(nums);
    }

    return nums;
  }

  private boolean isSorted(int[] nums) {
    for (int i = 0; i < nums.length-1; i++) {
      if (nums[i] > nums[i+1]) return false;
    }
    return true;
  }

  private void nextPermutation(int[] nums) {
    for(int i = 0; i < nums.length-1; i++) {
      if (nums[i] > nums[i+1]) {
        int num = nums[i];
        nums[i] = nums[i+1];
        nums[i+1] = num;
        return;
      }
    }
  }
}
