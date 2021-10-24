/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> neighbors;
    Node() {
        val = 0;
        neighbors = vector<Node*>();
    }
    Node(int _val) {
        val = _val;
        neighbors = vector<Node*>();
    }
    Node(int _val, vector<Node*> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/

class Solution {
public:
    Node* cloneGraph(Node* node) {
        if(node == NULL)
            return NULL;
        map<Node*, Node*> visited;
        queue<pair<Node*, Node*>> q;
        Node* cur = new Node(node->val);
        q.push({node, cur});
        visited[node] = cur;
        
        while(!q.empty()){
            auto u = q.front(); q.pop();
            Node *origin = u.first, *copied = u.second;
            
            for(Node* neighbor : origin->neighbors) {
                auto it = visited.find(neighbor);
                if(it == visited.end()){
                    Node *nxt_copied = new Node(neighbor->val);
                    copied->neighbors.push_back(nxt_copied);
                    
                    q.push({neighbor, nxt_copied});
                    visited[neighbor] = nxt_copied;
                } else
                    copied->neighbors.push_back(it->second);
            }
        }
        return cur;
    }
};