package leetcode;

/**
 * NO.2  两数相加
 *
 * @author Niuniu
 * @date 2024/1/4
 */
public class No2AddTwoNumbers {
    public static void main(String[] args) {
        ListNode n13 = new ListNode(3);
        ListNode n12 = new ListNode(4, n13);
        ListNode n11 = new ListNode(2, n12);
        ListNode n23 = new ListNode(4);
        ListNode n22 = new ListNode(6, n23);
        ListNode n21 = new ListNode(5, n22);
        ListNode listNode = addTwoNumbersWhitRecursion(n11, n21);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tempNode = new ListNode();
        ListNode res = tempNode;
        int temp = 0;
        while (l1 != null || l2 != null) {
            int l1val = l1 != null ? l1.val : 0;
            int l2val = l2 != null ? l2.val : 0;
            tempNode.val = l1val + l2val + temp;
            temp = 0;
            if (tempNode.val >= 10) {
                temp = tempNode.val / 10;
                tempNode.val = tempNode.val % 10;
            }
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            if (l1 == null && l2 == null) {
                if (temp != 0) {
                    tempNode.next = new ListNode(temp);
                }
                return res;
            }
            tempNode.next = new ListNode();
            tempNode = tempNode.next;
        }
        return null;
    }

    // 递归算法
    public static ListNode addTwoNumbersWhitRecursion(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }

    private static ListNode add(ListNode l1, ListNode l2, int bit) {
        if (l1 == null && l2 == null && bit == 0) {
            return null;
        }
        if (l1 != null) {
            bit += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            bit += l2.val;
            l2 = l2.next;
        }
        ListNode l = new ListNode();
        l.val = bit % 10;
        l.next = add(l1, l2, bit / 10);
        return l;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
