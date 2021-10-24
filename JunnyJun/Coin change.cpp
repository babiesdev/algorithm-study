class Solution {
public:
    int coinChange(vector<int>& coins, int amount) {
     
        int result=0;
        sort(coins.begin(), coins.end(), greater<int>());
        auto ptr = coins.begin();
        while(amount && ptr!=coins.end()){
            if(amount >= (*ptr)){
                result += (amount/(*ptr));
                amount %= (*ptr);
            }
            ptr++;
        }
        return amount ? -1 : result;
    }
};