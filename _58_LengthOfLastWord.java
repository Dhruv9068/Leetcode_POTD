// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.
// Example 1:
// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.

class Solution {
    public int lengthOfLastWord(String s) {
        
    String[] words = s.split(" ");
        if (words.length == 0)
            return 0;
         String lastWord = words[words.length - 1];
         return lastWord.length();   
    }
}
