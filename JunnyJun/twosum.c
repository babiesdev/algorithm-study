int *twoSum(int *nums, int numsSize, int target, int *returnSize)
{
    *returnSize = 2;
    int *result = (int *)malloc(sizeof(int) * (*returnSize));
    int i, j;

    result[0] = -1;
    result[1] = -1;
    for (i = 0; i < numsSize; i++)
    {
        for (j = 0; j < numsSize; j++)
        {
            if (i != j)
            {
                if (nums[i] + nums[j] == target)
                {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
    }

    return result;
}
