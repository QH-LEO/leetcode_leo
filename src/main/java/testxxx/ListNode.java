package testxxx;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: Hao Qin
 * @Date: 20-2-5  下午5:49
 * @Version 1.0
 */

class Solution {
    static List<Integer> aaa=new ArrayList<Integer>();
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
    public static List<Integer> geteach(ListNode TAG){
        if(TAG.next!=null){
            aaa.add(TAG.val);
            geteach(TAG.next);
        }else {
            aaa.add(TAG.val);
        }
        return aaa;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        a.next= new ListNode(8);
        ListNode a1=new ListNode(5);
        a1.next= new ListNode(88);
        ListNode A=mergeTwoLists(a,a1);
        geteach(A);
        for (Integer integer : aaa) {
            System.out.println(integer);
        }
    }
}