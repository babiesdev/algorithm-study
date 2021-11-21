/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
private:
    int ans;
    int dfs(TreeNode* root) {
        ans = max(ans, root->val);
        if(root->left == nullptr && root->right == nullptr)
            return root->val;
        
        int ret, left = 0, right = 0;
        if(root->left)
            left = max(0, dfs(root->left));
        if(root->right)
            right = max(0, dfs(root->right));
        ret = root->val + max(left, right);
        ans = max({ans, ret, root->val + left + right});
        return ret;
    }
public:
    int maxPathSum(TreeNode* root) {
        ans = -1e9;
        dfs(root);
        return ans;
    }
};