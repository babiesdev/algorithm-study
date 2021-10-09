x = int(input())

assert x >= 0

def recurseCall(n):
    if n == 0 or n == 1:
        return 1
    return n * recurseCall(n - 1)

print(recurseCall(x))

