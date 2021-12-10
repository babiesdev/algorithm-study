class Solution:
    def isValid(self, s: str) -> bool:        
        _dict = {"(":")","[":"]","{":"}"}
        stack = []
        
        for c in s:
            if c in _dict:
                stack.append(c)
                
            else:
                if len(stack) == 0:
                    return False
                
                last = stack.pop()
                
                if _dict[last] != c:
                    return False
        
        if stack:
            return False
        
        return True