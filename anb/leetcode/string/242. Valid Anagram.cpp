class Solution {
public:
    int characterReplacement(string s, int k) {
        int cnt[26]={},l=0,r=0, n=s.length(), i, maxi, ans=k, left;
        while(l < n) {
            left = 1;
            if(r < n){
                left = 0;
                cnt[s[r]-'A'] += 1;
                
                maxi = 0;
                for(i=0;i<26;i++) maxi = max(maxi, cnt[i]);
                
                if(r-l+1-maxi <= k) {
                    ans = max(ans, r-l+1);
                    r++;
                } else
                    left = 1;
            }
            if(left){
                if(r < n)
                    cnt[s[r]-'A'] -= 1; // rewind
                cnt[s[l]-'A'] -= 1;
                l++;
            }
        }
        return ans;
    }
};