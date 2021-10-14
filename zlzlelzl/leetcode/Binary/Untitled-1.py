a, b = 5, 1
########
bin_weight = 2

n = len(bin(max(a, b))[bin_weight:])

# 빈 가중치가 양수일때는 2 음수일떄는 3

if a * b < 0:
    a = abs(a)
    b = abs(b)


bin_a = bin(a)[bin_weight:].zfill(n)
bin_b = bin(b)[bin_weight:].zfill(n)

answer = []
carry_borrow = 0
for i in reversed(range(n)):
    answer.append(
        str(int(bin_a[i]) ^ int(bin_b[i]) ^ carry_borrow))

    carry_borrow = ((not (int(bin_a[i]) ^ int(bin_b[i]))) and carry_borrow) or (
        (not (int(bin_a[i])) and int(bin_b[i])))
print(carry_borrow)
# if carry_borrow:
#     answer.append("1")

print(answer)
