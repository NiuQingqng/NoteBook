package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 无重复最长子串
 *
 * @author Niuniu
 * @date 2023/5/23
 */
public class No3LengthOfLongestSubstring {

    public static void main(String[] args) {
        int length = lengthOfLongestSubstringWithMap("abba");
        System.out.println(length);
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int maxLen = 0;
        StringBuilder dst = new StringBuilder();
        while (right < s.length()) {
            while (dst.indexOf(s.substring(right, right + 1)) != -1) {
                dst.delete(0, 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            dst.append(s.charAt(right));
            right++;
        }
        return maxLen;
    }

    public static int lengthOfLongestSubstringWithMap(String s) {
        int maxLen = 0;
        int strLen = s.length();
        Map<Character, Integer> window = new HashMap<>();
        for (int left = 0, right = 0; right < strLen; right++) {
            char curChar = s.charAt(right);
            if (window.containsKey(curChar)) {
                left =Math.max(window.get(curChar) + 1, left);
            }
            maxLen = Math.max(maxLen, right - left + 1);
            window.put(curChar, right);
        }
        return maxLen;
    }
}
