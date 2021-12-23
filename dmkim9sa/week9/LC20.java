package leetcode.week9;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Valid Parentheses
 * Related Topic: String, Stack
 */
public class LC20 {
    public static void main(String[] args) {
        boolean solution = isValid2("(){}}{");
        System.out.println("solution = " + solution);
    }

    public static boolean isValid2(String s) {

        Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if(stack.isEmpty() || stack.pop() != map.get(c)) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!stack.isEmpty() && (stack.peek() + 1 == ch || stack.peek() + 2 == ch)) {
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}

