const int INF = (1LL << 31) - 1;
class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int ans = -INF;
        pair<int, int> bef(1,1), cur;
        for(int& n : nums){
            cur.first = max({n, n * bef.first, n * bef.second});
            cur.second = min({n, n * bef.first, n * bef.second});
            
            bef = cur;            
            ans = max({ans, n, cur.first});
        }
        return ans;
    }
};