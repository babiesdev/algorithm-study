#include<set>
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        int L, R, l = -1, r = -1;
        
        sort(intervals.begin(), intervals.end());
        for(vector<int>& interval : intervals) {
            L = interval[0], R = interval[1];
            
            if(l <= L && L <= r)
                r = max(r, R);
            else {
                if(l != -1)
                    res.push_back({l, r});
                l = L, r = R;
            }
        }
        res.push_back({l, r});
        
        return res;
    }
};