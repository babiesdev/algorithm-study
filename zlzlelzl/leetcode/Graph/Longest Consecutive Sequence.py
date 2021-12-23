class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        
        
        if len(nums) == 0:
            return 0
        
        map_nums = {key:0 for key in nums}
        
        for num in nums:
            
            current_count = 0
            
            if map_nums[num] != 0: # 이미 계산된 수 넘겨서 중복 제거
                continue
            
            while True:
                current_count += 1
                
                if map_nums.get(num + current_count) == None:
                    map_nums[num] = current_count
                    break
                
                if map_nums.get(num + current_count) == 0: # map_nums가 값이 없을 때
                    map_nums[num + current_count] = current_count
                else: # map_nums가 값이 있을 때
                    map_nums[num] = map_nums[num+current_count] + current_count
                    break
             
        return max(map_nums.values())