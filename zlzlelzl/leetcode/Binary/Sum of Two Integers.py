class Solution:
    def getSum(self, a: int, b: int) -> int:
        # 둘 중 하나가 0이라면 계산하지 않고 리턴
        if a * b == 0:
            return a if b == 0 else b

        # 계산 편하게 하기 위해 a > b 상태 유지
        if a < b:
            a, b = b, a

        def dec_to_bin(x):
            return bin(x).lstrip("-").lstrip("0b")

        bin_a, bin_b = dec_to_bin(a), dec_to_bin(b)

        n = max(len(bin_a), len(bin_b))  # 최대 자리수
        bin_a, bin_b = bin_a.zfill(n), bin_b.zfill(n)
        raw_answer = []
        carry_borrow = 0

        for i in reversed(range(n)):
            raw_answer.append(
                str(int(bin_a[i]) ^ int(bin_b[i]) ^ carry_borrow))

            # 둘 다 양수 또는 음수면 add
            if a * b > 0:
                carry_borrow = ((int(bin_a[i]) ^ int(bin_b[i])) and carry_borrow) \
                    or (int(bin_a[i]) and int(bin_b[i]))\

            # 둘 중 하나만 양수라면 subtract
            else:
                carry_borrow = ((not (int(bin_a[i]) ^ int(bin_b[i]))) and carry_borrow) \
                    or ((not (int(bin_a[i])) and int(bin_b[i])))

        if carry_borrow:
            raw_answer.append("1")

        answer = int("".join(reversed(raw_answer)), 2)

        # 음수가 되는 조건
        # 1. 둘 다 음수
        # 2. 둘 중 하나가 음수이면서 음수의 절대값이 더 큼
        # or (b < 0 and abs(b) > abs(a)): # a가 더 크므로 필요없는 식
        if (a < 0 and b < 0) or (a < 0 and abs(a) > abs(b)):
            answer = -answer

        return answer


s = Solution()

print(s.getSum(-14, 16))
