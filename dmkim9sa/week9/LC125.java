package leetcode.week9;

/**
 * Valid Palindrome: 거꾸로 읽어도 같은 문자가 되는 문자
 * Related Topic: Two Pointer, String
 */
public class LC125 {

    public static void main(String[] args) {
        boolean solution = isPalindrome2(",,,,,,,,,,,,acva");
        System.out.println("solution = " + solution);
    }

    // 정규식 풀이법 => 시간 오래걸림...
    public static boolean isPalindrome2(String s) {

        String s1 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); // 숫자, 영문자가 아니면 공백처리
        for (int i = 0; i < s1.length() / 2; i++) {
            if(s1.charAt(i) != s1.charAt(s1.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    // 내 풀이 (투포인터)
    public static boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <='9') {
                sb.append(ch);
            }
        }
        char[] chArr = sb.toString().toLowerCase().toCharArray();

        boolean flag = true; // 문자 검사 변수
        int left = 0; // 시작 포인터
        int right = chArr.length - 1; // 끝 포인터

        int length = chArr.length;
        if(length % 2 == 0) { // 문자가 짝수인 경우
            while(left <= (length / 2) - 1 && right >= (length / 2)) {

                if(chArr[left] != chArr[right]) {
                    flag = false;
                    break;
                }
                left++;
                right--;
            }
        } else { // 문자가 홀수인 경우
            while(left <= (length / 2) && right >= (length / 2) + 1) {
                if(chArr[left] != chArr[right]) {
                    flag = false;
                    break;
                }
                left++;
                right--;
            }
        }

        return flag;
    }
}
