// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

//  Example 1:

// Input: s = "egg", t = "add"
// Output: true
// Example 2:

// Input: s = "foo", t = "bar"
// Output: false

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        
        Map<Character, Character> map = new HashMap<Character, Character>();
		for(int i =0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i)) == false) {
				if(map.containsValue(t.charAt(i)) == false) map.put(s.charAt(i), t.charAt(i));
				else return false;	
			} else if (map.get(s.charAt(i)) != t.charAt(i)) return false;
		}
		return true;
    }
}
