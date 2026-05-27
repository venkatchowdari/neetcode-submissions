class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            int need = target - numbers[i];

            if(map.containsKey(need)){
                return new int[]{map.get(need)+1, i+1};
            }

            map.put(numbers[i], i);
        }

        return new int[]{};
        // int left = 0, right = numbers.length-1;
        // int[] res = new int[2];

        // while(left < right){
        //     int sum = numbers[left] + numbers[right];
        //     if(sum == target){
        //         res[0] = left+1;
        //         res[1] = right+1;

        //         return res;
        //     }else if(sum > target){
        //         right--;
        //     }else{
        //         left++;
        //     }
        // }

        // return new int[]{};
    }
}
