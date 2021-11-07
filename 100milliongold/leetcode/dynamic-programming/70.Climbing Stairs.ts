function climbStairsTail(n: number, before : number , next: number): number {
    if(n === 0) {
        return before
    }
    else {
        return climbStairsTail(n-1 , next , before + next)
    }
        
};

function climbStairs(n: number): number {
    return climbStairsTail(n , 1 ,1)
};

//1+1+1+1
//1+2+1
//2+1+1
//2+2
//3+1


/***
function climbStairs(n: number): number {
    if(n === 1)
        return 1
    
    if(n === 2)
        return 2
    
    return climbStairs(n-1) + climbStairs(n-2)
};
*/