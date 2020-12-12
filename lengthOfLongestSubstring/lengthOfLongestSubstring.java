class Solution {

    //HashSet implementation
    public int lengthOfLongestSubstringHashSet(String s) {
        int i = 0, j = 0, max = 0;
        HashSet<Character> set = new HashSet<>();
        while(i < s.length()) {
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(j++));
            }
        }
       return max;
    }

    //HashMap implementation
  public int lengthOfLongestSubstringMap(String s) {
  int ret = 0;
  Map<Character, Integer> map = new HashMap<>();
  for (int i = 0, start = 0; i < s.length(); i++) {
       char c = s.charAt(i);
       if (map.containsKey(c))
           start = Math.max(map.get(c)+1, start);
       ret = Math.max(ret, i-start+1);
       map.put(c, i);
   }
   return ret;
   }

   //Array implementation
   public int lengthOfLongestSubstringArray(String s) {
    short[] indexes = new short[128];
    int start = 1, max = 0;
    for (int i = 1; i <= s.length(); i++) {
      char ch = s.charAt(i - 1);
      if (indexes[ch] >= start) {
        start = indexes[ch] + 1;
      } else {
        max = Math.max(max, i - start + 1);
      }
      indexes[ch] = (short) i;
    }
    return max;
  }
}
