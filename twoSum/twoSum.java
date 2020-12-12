class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int[] indices = new int[2];
        for(int i = 0; i < nums.length; i++) {
           if(tracker.containsKey(nums[i])) {
               int index1 = tracker.get(nums[i]);
               indices[0] = index1;
               indices[1] = i;
           }
           else {
               tracker.put(target - nums[i], i);
           }
        }
        return indices;
    }
}
