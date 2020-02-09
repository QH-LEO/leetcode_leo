/**
 * @Author: Hao Qin
 * @Date: 20-2-9  上午1:38
 * @Version 1.0
 */
 class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
public class reversell {
    public reversell(ListNode a1) {
    }
//尾插法也可逆转
    public static ListNode reverseList(ListNode head) {
        //申请节点，pre和 cur，pre指向null
        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp = null;
        while(cur!=null) {
            //记录当前节点的下一个节点
            tmp = cur.next;
            //然后将当前节点指向pre
            cur.next = pre;
            //pre和cur节点都前进一位
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode A1=new ListNode(1);
        ListNode A2=new ListNode(2);
        ListNode A3=new ListNode(3);
        A1.next=A2;
        A2.next=A3;
        System.out.println(A1.next.val);
        ListNode AA=reverseList(A1);
        System.out.println(A3.next.val);
    }
}