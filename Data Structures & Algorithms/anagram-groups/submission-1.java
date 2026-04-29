class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String s: strs){
            int[] count = new int[26];
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            String sortedStr = Arrays.toString(count);
            // char[] charArray = s.toCharArray();
            // Arrays.sort(charArray);
            // String sortedStr = new String(charArray);
            res.putIfAbsent(sortedStr, new ArrayList<>());
            res.get(sortedStr).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
