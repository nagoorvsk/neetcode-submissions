class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        for index,num in enumerate(nums):
            if(num in nums[index+1:]):
                return True
        
        return False

nums = [1, 2, 3, 3]
s = Solution()
s.hasDuplicate(nums)

        