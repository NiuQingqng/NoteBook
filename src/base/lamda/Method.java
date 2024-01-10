package base.lamda;

import java.util.Arrays;

/**
 * 方法引用
 *
 * @author Luyu
 * @date 2023/11/20
 */
public class Method {
    public static void main(String[] args) {
        String[] array = new String[] { "Apple", "Orange", "Banana", "Lemon" };
        Arrays.sort(array, String::compareTo);
        System.out.println(String.join(", ", array));
    }

    static int cmp(String s1, String s2) {
        return s1.compareTo(s2);
    }
}
