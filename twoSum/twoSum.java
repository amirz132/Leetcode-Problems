class Solution {
  public int[] twoSum(int[] nums, target) {
    HashMap<Integer> tracker = new HashMap<Integer>();
    int[] indices = new int[2];
    for(int i = 0; i < nums.length; i++) {
      if(tracker.containsKey(nums[i])) {
        int index1 = tracker.get(nums[i]);
        indices[0] = index1;
        indices[1] = i;
      }
    }
    return indices;
  }
}
