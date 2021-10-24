class Solution
{
private:
    unordered_map<Node *, Node *> um;

public:
    Node *cloneGraph(Node *node)
    {
        if (!node)
            return NULL;
        Node *cpnode = new Node(node->val);
        um[node] = cpnode;
        queue<Node *> nq;
        nq.push(node);
        while (!nq.empty())
        {
            Node *origin = nq.front();
            nq.pop();
            for (int i = 0; i < origin->neighbors.size(); ++i)
            {
                Node *neighbor = origin->neighbors[i];
                if (um.find(neighbor) == um.end())
                {
                    um[neighbor] = new Node(neighbor->val);
                    nq.push(neighbor);
                }
                um[origin]->neighbors.push_back(um[neighbor]);
            }
        }
        return cpnode;
    }
};