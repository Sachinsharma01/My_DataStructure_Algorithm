package Leetcode;

import DSA_College.LinkList.ListNode;

import java.util.HashMap;

public class Leetcode_203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;
        ListNode curr = head;
        ListNode pre = null;
        while(curr != null){
            if(curr.data == val && pre!=null){
                pre.next = curr.next;
                curr = curr.next;
            }else if(curr.data == val){
                curr = curr.next;
                head = curr;
            } else{
                pre = curr;
                curr = curr.next;
            }

        }

        return head;
    }
}
