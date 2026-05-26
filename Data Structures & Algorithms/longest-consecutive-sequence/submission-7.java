class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int longestCon = 1;
        int count = 1;


        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);

        for(int num : set){
            int j = 1;
            if(!set.contains(num-j)){
                while(set.contains(num+j)){
                    count++;
                    j++;
                    longestCon = Math.max(longestCon, count);
                }
                count = 1;
            }else{
                count = 1;
            }
        }

        return longestCon;
    }
}





// class Solution {
//     public int longestConsecutive(int[] nums) {

//         if(nums.length == 0) return 0;
//         if(nums.length == 1) return 1;
//         int longestCon = 1;

//         HashSet<Integer> set = new HashSet<>();

//         for(int num: nums) set.add(num);

//         int count = 1;
//         for(int i=0;i<nums.length;i++){
//             int j = 1;
//             int num = nums[i];
//             if(!set.contains(num-j)){
//                 while(set.contains(num+j)){
//                     count++;
//                     j++;
//                     longestCon = Math.max(count, longestCon);
//                 }
//                 count = 1;
//             }else{
//                 count = 1;
//             }
//         }
       
//         return longestCon;
        
        

//         // return longestCon;


//         // if(nums.length == 0) return 0;
//         // if(nums.length == 1) return 1;
//         // int longestCon = 1;
//         // Arrays.sort(nums);

//         // int count = 1;
//         // int curr = 0;  
//         // for(int i=0;i<nums.length-1;i++){
//         //     if(nums[i] == nums[i+1]) continue;
//         //     if(nums[curr] == nums[i+1]-1) {
//         //         count++;
//         //         curr = i+1;
//         //     }
//         //     else {
//         //         count = 1;
//         //         curr = i+1;
//         //     }
//         //     longestCon = Math.max(count, longestCon);
//         // }

//         // return longestCon;  
//     }
// }
