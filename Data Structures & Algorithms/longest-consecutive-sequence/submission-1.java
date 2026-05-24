class Solution {
    public int longestConsecutive(int[] nums) {

        // int longestCon = 0;
        // TreeSet<Integer> set = new TreeSet<>();
        // for(int num: nums) set.add(num);

        // int count = 0;
        // Iterator it = set.iterator();
        // int curr = it.next();
        // while(it.hasNext()){
        //     if(curr+1 == it.hasNext()) count++;
        //     else count = 0;
            
        //     longestCon = Math.max(count, longestCon);
        // }
        
        
        

        // return longestCon;


        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int longestCon = 1;
        Arrays.sort(nums);

        int count = 1;
        int curr = 0;  
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]) continue;
            if(nums[curr] == nums[i+1]-1) {
                count++;
                curr = i+1;
            }
            else {
                count = 1;
                curr = i+1;
            }
            longestCon = Math.max(count, longestCon);
        }

        return longestCon;  
    }
}
