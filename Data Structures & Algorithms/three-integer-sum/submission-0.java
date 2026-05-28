class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            int need = -nums[i];
            int j = i+1, k = nums.length-1;
            while(j < k){
                List<Integer> res = new ArrayList<>();
                if(nums[j] + nums[k] == need){
                    res.add(nums[i]);
                    res.add(nums[j++]);
                    res.add(nums[k--]);

                    if(!result.contains(res))result.add(res);
                }else if(nums[j]+nums[k] < need){
                    j++;
                }else{
                    k--;
                }
            }        
        }

        return result;
    }
}
