class Solution:
    def countSubstrings(self, s: str) -> int:
       
        answer = [0]
        
        def len_palindrome(idx, is_continuos):
            idx_minus, idx_plus = idx, idx
            
            if is_continuos: # 연속된 값이면 +1
                idx_plus += 1
              
            while True:
                # 범위를 벗어나거나 팰린드롬이 끝났다면 리턴
                if not (0 <= idx_minus < len(s) and 0 <= idx_plus < len(s)) or s[idx_minus] != s[idx_plus]:
                    return s[idx_minus+1:idx_plus]

                idx_minus -= 1
                idx_plus += 1
                answer[0] += 1
        
        for i in range(len(s)):
            len_palindrome(i,1)
            len_palindrome(i,0)
                    
        return answer[0]
        
        
#         def is_palindrome(i,j):
#             while i < j:
#                 if s[i] != s[j]:
#                     return False
                
#                 i += 1 
#                 j -= 1
                
#             return True
        
#         # 한 글자는 무조건 팰린드롬
#         answer = len(s)
        
#         for i in range(len(s)):
#             for j in range(i+1, len(s)):
#                 if is_palindrome(i,j):
#                     answer += 1
                    
#         return answer