class Solution
{
public:
    int maxProfit(vector<int> &prices)
    {
        int min = 20000, result = 0, i;

        for (i = 0; i < prices.size(); i++)
        {
            if (prices[i] < min)
            {
                min = prices[i];
            }
            if (result < (prices[i] - min))
            {
                result = (prices[i] - min);
            }
        }
        return result;
    }
};