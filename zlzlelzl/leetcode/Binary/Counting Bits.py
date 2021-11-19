class Solution:
    def countBits(self, n: int) -> List[int]:
        li = []

        for i in range(n+1):
            li.append(bin(i).count("1"))

        return li
