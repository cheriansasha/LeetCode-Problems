class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        # understand:
        # is checking if n / 2 times an int div?

        # match: hash map - keeping track of how many of each element there is

        # plan:
        # if key is not in hashmap,
            # add key to hashmap with value one
        # else, add +1 to the key's curr value

        # iterate through hashmap and for each key-val pair
        # check if n / 2 is greater than then value
            #if yes, return key
        # else, keep going

        # implement:
        dict = {}
        n = len(nums)
        numToCompare = n / 2

        for num in nums:
            if num not in dict:
                dict[num] = 1
            else:
                dict[num] += 1

        for key,value in dict.items():
            if value > numToCompare:
                return key

        return -1



        