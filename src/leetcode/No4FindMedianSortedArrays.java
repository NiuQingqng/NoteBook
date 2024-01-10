package leetcode;

/**
 * 寻找两个正序数组的中位数
 *
 * @author Niuniu
 * @date 2024/1/9
 */
public class No4FindMedianSortedArrays {
    public static void main(String[] args) {
        double medianSortedArrays = findMedianSortedArraysBetter(new int[]{}, new int[]{-1, 6, 7});
        System.out.println(medianSortedArrays);
//        System.out.println(4 % 2 == 0);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 定义变量
        int pos1 = nums1.length - 1;
        int pos2 = nums2.length - 1;
        int tLen = pos1 + pos2 + 2;
        int len = tLen / 2 + 1;
        int num1 = 0, num2 = 0;
        for (int i = 0; i < len; i++) {
            // 取第一个数
            if (i == len - 2) {
                if (pos1 == -1) {
                    num1 = nums2[pos2];
                } else if (pos2 == -1) {
                    num1 = nums1[pos1];
                } else {
                    num1 = Math.max(nums1[pos1] ,nums2[pos2]);
                }
            }
            // 取第二个数
            if (i == len - 1) {
                if (pos1 == -1) {
                    num2 = nums2[pos2];
                } else if (pos2 == -1) {
                    num2 = nums1[pos1];
                } else {
                    num2 = Math.max(nums1[pos1] ,nums2[pos2]);
                }
            }
            // 移动数组指针
            if (pos1 == -1) {
                pos2--;
            } else if (pos2 == -1) {
                pos1--;
            } else {
                if (nums1[pos1] > nums2[pos2]) {
                    pos1--;
                } else {
                    pos2--;
                }
            }
        }
        if (tLen % 2 == 0) {
            return (num1 + num2) / 2.0;
        } else {
            return num2;
        }
    }

    // 优化方法
    public static double findMedianSortedArraysBetter(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int mid = len / 2 + 1;
        int pos1 = 0, pos2 = 0;
        int num1 = 0, num2 = 0;
        for (int i = 0; i < mid; i++) {
            num1 = num2;
            if (pos2 >= nums2.length || (pos1 < nums1.length && nums1[pos1] < nums2[pos2])) {
                num2 = nums1[pos1++];
            } else {
                num2 = nums2[pos2++];
            }
        }
        if (len % 2 == 0) {
            return (num1 + num2) / 2.0;
        } else {
            return num2;
        }
    }
}
