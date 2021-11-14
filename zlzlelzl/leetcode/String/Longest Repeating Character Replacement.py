class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        char = [0] * 26

        l, r = 0, 0
        max_count = 0

        while r < len(s):
            char[ord(s[r])-ord("A")] += 1
            max_count = max(max_count, char[ord(s[r])-ord("A")])

            if k + max_count < r + 1 - l:
                char[ord(s[l])-ord("A")] -= 1
                l += 1

            r += 1

        return r - l
