class Solution {
    public boolean isPalindrome(String s) {
       int left = 0, right = s.length()-1;
       s = s.toLowerCase();     

       while(left <= right){
        while(!isLetterOrDigit(s.charAt(left)) && left < right)left++;
        while(!isLetterOrDigit(s.charAt(right)) && left < right)right--;

        if(s.charAt(left) != s.charAt(right)) return false;
        left++;
        right--;
       }

       return true;
    }

    boolean isLetterOrDigit(char c){
        return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9');
   }
}
 