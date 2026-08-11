class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mpp = new HashSet<>();
        
        for (int num : nums) {
            if (mpp.contains(num)) {
                return true;
            }
            mpp.add(num);
        }
        
        return false;
    }
}