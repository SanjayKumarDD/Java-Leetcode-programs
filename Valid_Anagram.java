//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

class Solution {
    public boolean isAnagram(String s, String t) {     
        int count[] = new int[26];           
            if(s.length() == t.length()){

                for(int i =0;i<s.length();i++){
                    count[s.charAt(i) - 'a']++;
                    count[t.charAt(i) - 'a']--;
                }    
                for(int j=0;j<26;j++){
                    if(count[j] != 0){
                        return false;
                    }
                }
                return true;
            }    
        return false;
        }    
}
