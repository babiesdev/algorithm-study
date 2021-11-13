const int MAX_N = 1e5;
class Solution {
public:
    bool canFinish(int numCourses, vector<vector<int>>& prerequisites) {
        int ind[MAX_N]={}, i, a, b;
        bool ans = true;
        queue<int> q;
        vector<int> adj[MAX_N];
        for(vector<int>& e : prerequisites) {
            a = e[0], b = e[1];
            adj[b].push_back(a);
            ind[a]++;
        }
        for(i=0;i<numCourses;i++)
            if(ind[i] == 0)
                q.push(i);
        while(!q.empty()){
            a = q.front(); q.pop();
            for(int& v : adj[a]) {
                ind[v] -= 1;
                if(ind[v] == 0)
                    q.push(v);
            }
        }
        
        for(i=0;i<numCourses;i++)
            ans &= ind[i] == 0;
        return ans;
    }
};