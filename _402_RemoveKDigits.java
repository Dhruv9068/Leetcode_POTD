//Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.

//Example 1:
//Input: num = "1432219", k = 3
//Output: "1219"
//Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.

//Example 2:
//Input: num = "10200", k = 1
//Output: "200"
//Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.


class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder s = new StringBuilder();
        s.append(num.charAt(0));
        for (int i = 1; i < num.length(); ++i) {
            if (k > 0 && s.length() > 0 && num.charAt(i) < s.charAt(s.length() - 1)) {
                s.deleteCharAt(s.length() - 1);
                k--;
                i--;
                continue;
            }
            s.append(num.charAt(i));
        }
        while (k > 0 && s.length() > 0) {
            s.deleteCharAt(s.length() - 1);
            k--;
        }
        while (s.length() > 0 && s.charAt(0) == '0') {
            s.deleteCharAt(0);
        }
        if (s.length() == 0) {
            s.append('0');
        }
        return s.toString();
    }
}
