package base.num;

import java.util.Random;

/**
 * 随机串
 *
 * @author Luyu
 * @date 2023/10/16
 */
public class Num {
    private static final Random RANDOM = new Random();

    private static char[] chars = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g',
            'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u',
            'v', 'w', 'x', 'y', 'z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G',
            'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U',
            'V', 'W', 'X', 'Y', 'Z'
    };

    private static char[] nums = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    };

    /**
     * 随机生成由a-zA-Z组合而成的字符串
     *
     * @param len 字符串长度
     * @return 生成结果
     */
    public static String randomChar(int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(chars[RANDOM.nextInt(chars.length)]);
        }
        return sb.toString();
    }

    /**
     * 随机生成由0-9a-zA-Z组合而成的字符串
     *
     * @param clen 字符长度  nlen 数字长度
     * @return 生成结果
     */
    public static String randomCharAndNums(int clen, int nlen) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < clen; i++) {
            sb.append(chars[RANDOM.nextInt(chars.length)]);
        }
        for (int i = 0; i < nlen; i++) {
            sb.append(chars[RANDOM.nextInt(nums.length)]);
        }
        return sb.toString();
    }
}
