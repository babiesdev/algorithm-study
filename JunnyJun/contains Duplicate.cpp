class Solution
{
public:
    bool containsDuplicate(vector<int> &nums)
    {
        /**
         * 정렬해서 값 비교하기
         * */
        if (nums.size() < 2)
        {
            return false;
        }

        sort(nums.begin(), nums.end());

        for (int i = 0; i < nums.size() - 1; i++)
        {
            if (nums[i] == nums[i + 1])
            {
                return true;
            }
        }

        return false;
    }
};