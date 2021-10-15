class Solution(object):
    def getSum(self, a, b):
        """
        :type a: int
        :type b: int
        :rtype: int
        """
        def _sum(a, b):
            _common, _union = 0, 0
            while True:
                _union = a ^ b
                _common = a & b
                a = _union
                
                if _common == 0:
                    break
                
                _common = _common << 1
                b = _common
            return a
        
        def _sub(a, b):
            for i in range(10):
                if ((1 << i) & b) > 0:
                    for j in range(i, 10):
                        if ((1 << j) & a) > 0:
                            break
                    
                    a = a ^ (1 << j)
                    for k in range(i,j):
                        a = a | (1 << k)
            return a
        
        if a * b < 0:
            if abs(a) < abs(b):
                a, b = b, a
            negative = a < 0
            coe = 1
            if negative:
                coe = -1
            c = _sub(abs(a), abs(b))
            return coe * c 
        else:
            negative = a < 0 and b < 0
            coe = 1
            if negative:
                coe = -1
            c = _sum(coe * a, coe * b)
            return coe * c
        return -1