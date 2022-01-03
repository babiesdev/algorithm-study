class Solution:
    def longestPalindrome(self, s: str) -> str:

        def len_palindrome(idx, is_continuos):
            idx_minus, idx_plus = idx, idx

            if is_continuos:  # 연속된 값이면 +1
                idx_plus += 1

            while True:
                # 범위를 벗어나거나 팰린드롬이 끝났다면 리턴
                if not (0 <= idx_minus < len(s) and 0 <= idx_plus < len(s)) or \
                        s[idx_minus] != s[idx_plus]:
                    return s[idx_minus+1:idx_plus]

                idx_minus -= 1
                idx_plus += 1

        max_len = 0
        answer = ""

        for i in range(len(s)):
            strs = len_palindrome(i, 1), len_palindrome(
                i-1, 1), len_palindrome(i, 0)

            for j in range(3):
                if max_len < len(strs[j]):
                    max_len = len(strs[j])
                    answer = strs[j]

        return answer
