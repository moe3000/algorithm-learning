package feb;

import common.ListNode;

import java.util.Stack;

/**
 * @author lyc1, lyc1@erongdu.com
 * @version 1.0.0
 * Copyright 杭州融都科技股份有限公司 All Rights Reserved
 * 官方网站：www.erongdu.com
 * <p>
 * 未经授权不得进行修改、复制、出售及商业使用
 * @since 2019-02-18
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode = null;
        Stack<Integer> l1i = new Stack<>();
        Stack<Integer> l2i = new Stack<>();
        while (l1 != null && l2 != null) {
            l1i.push(l1.val);
            l2i.push(l2.val);

            l1 = l1.next;
            l2 = l2.next;
        }
        int carry = 0;
        while (!l1i.empty()) {
            int val = l1i.pop() + l2i.pop() + carry;
            if (carry != 0 ) {
                carry = 0;
            }
            ListNode temp;
            if (val >= 10) {
                temp = new ListNode(val % 10);
                carry = val / 10;
            } else {
                temp = new ListNode(val);
            }
            temp.next = newNode;
            newNode = temp;
        }
        return newNode;
    }

}
