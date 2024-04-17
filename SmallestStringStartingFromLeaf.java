// You are given the root of a binary tree where each node has a value in the range [0, 25] representing the letters 'a' to 'z'.

// Return the lexicographically smallest string that starts at a leaf of this tree and ends at the root.

// As a reminder, any shorter prefix of a string is lexicographically smaller.

// For example, "ab" is lexicographically smaller than "aba".
// A leaf of a node is a node that has no children.

// Example 1:


// Input: root = [0,1,2,3,4,3,4]
// Output: "dba"



class Solution {
    public String smallestFromLeaf(TreeNode root) {
         dfs(root , new StringBuilder());
        return ans;
         
    }
    public String ans = null;
    private void dfs(TreeNode root , StringBuilder sb){
        if(root ==null){
            return;
        }
        sb.append((char) (root.val +'a'));
        
        if(root.left ==null && root.right==null){
            String path = sb.reverse().toString();
            sb.reverse();
             if (ans == null || ans.compareTo(path) > 0)
                ans = path;
             }
        
        
        dfs(root.left , sb);
        dfs(root.right , sb);
        sb.deleteCharAt(sb.length()-1);
        
    }
}
