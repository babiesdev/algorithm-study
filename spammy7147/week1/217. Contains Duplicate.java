import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Stream 사용 중복제거 후 길이 비교 결과 출력
 */
class Solution2171{
    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().toArray().length != nums.length;
    }
}

/**
 * HashSet 사용
 * primitive 타입 int[] 리스트 변환은 Arrays.asList 사용이 불가능! 참조형 변수만 사용가능
 */
class Solution2172{
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> numsSet = new HashSet<>();
       for( int i : nums){
           numsSet.add(i);
       }
       return numsSet.size() != nums.length;

    }
}


class Main217 {
    public static void main(String[] args) {
//        boolean result = new Solution2171().containsDuplicate(new int[]{1,2,3,1});
//        boolean result = new Solution2171().containsDuplicate(new int[]{1,2,3,4});
//        boolean result = new Solution2172().containsDuplicate(new int[]{1,2,3,1});
        boolean result = new Solution2172().containsDuplicate(new int[]{1,2,3,4});
        System.out.println(result);
    }
}
