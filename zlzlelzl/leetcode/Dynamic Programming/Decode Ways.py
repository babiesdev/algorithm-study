class Solution:
    def numDecodings(self, s: str) -> int:
        # bfs로 범위 안의 문자열을 큐에 넣고 문자열이 끝날때까지 진행, 끝에 닿는 큐 카운트
        # 시간초과 -> dp형식으로 바꿈
        # 큐 형태를 all or nothing으로 바꿔 같은 논리를 가질 수 있게 함
        
        decode_map = [str(i) for i in range(1,27)]
        
        if len(s) == 1:
            return int(s in decode_map)

        dp = [0] * len(s)
        dp[0] = int("1" <= s[0] <= "9")
        dp[1] = (dp[0] if s[1] in decode_map else 0) + int(s[0:2] in decode_map)
        
        for i in range(2, len(s)):
            dp[i] = dp[i-1] if s[i] in decode_map else 0
            dp[i] += dp[i-2] if s[i-1:i+1] in decode_map else 0

        return dp[-1]
    
        # count = [0]
        
#         def bfs():
#             q = deque()
            
#             q.append(0)
                        
#             while q:
#                 idx = q.popleft()
                
#                 if idx > len(s): # 범위 넘어가는 경우 예외처리
#                     continue
                    
#                 if idx == len(s): # 끝에 닿는 큐
#                     count[0] += 1
#                     continue

#                 if s[idx] in decode_map:
#                     q.append(idx+1)
#                 if s[idx:idx+2] in decode_map:
#                     q.append(idx+2)
#         bfs()
#         return count[0]
    
        