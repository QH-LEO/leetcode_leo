/**
 * @Author: Hao Qin
 * @Date: 20-2-5  下午5:49
 * @Version 1.0
 */


  public class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {
        
    }
}

