package leetcode.week5;

import java.util.Arrays;

// Longest Repeating Character Replacement

/**
 * 1. 슬라이딩 윈도우는 항상 오른쪽으로 한 칸씩 이동한다.
 * 2. 현재 슬라이딩 윈도우에 들어있는 값들의 수를 계산한다.
 * 3. 슬라이딩 윈도우의 크기 - 가장 큰 비중의 값의 갯수 = 바꿔야하는 갯수이다.
 * 4. 만약, 바꿔야하는 갯수가 k보다 크다면 현재 슬라이딩 윈도우는 불가하므로 왼쪽을 증가시켜 슬라이딩 윈도우의 크기를 줄인다.
 * 5. k가 크거나 같다면 현재 윈도우와 최대 윈도우의 크기를 비교해 최대 윈도우를 갱신시킨다.
 */
public class LC424 {

    public static void main(String[] args) {
        int solution = characterReplacement("ABAB", 2);
        System.out.println("solution = " + solution);
    }

    public static int characterReplacement(String s, int k) {

        int[] count = new int[26];
        char[] chars = s.toCharArray();
        int left = 0;
        int max = 0;
        int maxLength = 0;

        for (int right = 0; right < chars.length; right++) {
            count[chars[right] - 'A']++;
            max = Math.max(max, count[chars[right] - 'A']); // 현재 윈도우에서 가장 많이 나오는 문자의 개수
            System.out.println("max = " + max);

            int remain = (right - left + 1) - max; // 바꿔야하는 문자의 개수
            System.out.println("remain = " + remain);

            if(remain > k) { // 바꿔야 하는 문자의 개수가 k보다 많으면 윈도우를 한 칸 옮겨야함
                count[chars[left] - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
