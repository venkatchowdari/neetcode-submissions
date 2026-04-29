class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            map.put((char)s.charAt(i), map.getOrDefault((char) s.charAt(i), 0)+1);
        }

        for(int i=0;i<t.length();i++){
            map.put((char)t.charAt(i), map.getOrDefault((char) t.charAt(i), 0)-1);
        }

        for(Character val : map.keySet()){
            if(map.get(val) != 0) return false;
        }
        return true;
    }
}
