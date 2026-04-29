class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hp = new HashSet<>();

        int numsLen = nums.length;
        for(int i = 0;i <= numsLen - 1;i++){
            if(hp.add(nums[i])){
                continue;
            }
            else{
                return true;
            }
        }
        return false;
        // if(numsLen < hp.size()){
        //     return true;
        // }
        // else{
        //     return false;
        // }
    }
}
