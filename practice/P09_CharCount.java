import java.util.HashMap;
import java.util.Map;

/**
 * P09 字符统计与回文
 *
 * 两件事：
 *   1. 统计 "hello world" 每个字符出现的次数
 *   2. 判断 "上海自来水来自海上" 是否回文（正着读反着读一样）
 *
 * 考：String 遍历（charAt / toCharArray）、Map 的用法、双指针判断回文。
 */
public class P09_CharCount {

    /** 统计每个字符出现次数 */
    public static Map<Character, Integer> countChars(String s) {
        Map<Character, Integer> map = new HashMap<>();
        // TODO：
        //   for (int i = 0; i < s.length(); i++) {
        //       char c = s.charAt(i);
        //       // 如果 map 里已有 c，次数 +1；否则放进去记 1
        //       // 提示：map.getOrDefault(c, 0) + 1
        //   }
        return map;
    }

    /** 判断回文 */
    public static boolean isPalindrome(String s) {
        // TODO：双指针，i 从头、j 从尾，向中间靠
        //   只要有一步 s.charAt(i) != s.charAt(j) 就返回 false
        //   全部走完没冲突返回 true
        return false;
    }

    public static void main(String[] args) {
        // TODO 1：统计 "hello world"（空格也算一个字符）
        //   预期：l 出现 3 次，o 出现 2 次，其余 1 次
        String s1 = "hello world";
        // System.out.println(countChars(s1));

        // TODO 2：判断回文
        //   "上海自来水来自海上" -> true
        //   "hello"             -> false
        //   "abba"              -> true
    }
}
