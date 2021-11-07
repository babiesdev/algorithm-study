class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int l = 0, r = 0, ans = 0, tmp, N = s.length(), c[256]={};
        while(l < N){
            if(r < N && !c[s[r]]) {
                c[s[r]] = 1;
                r++;
            } else {
                c[s[l]] = 0;
                l++;
            }
            ans = max(ans, r - l);
        }
        return ans;
    }
};