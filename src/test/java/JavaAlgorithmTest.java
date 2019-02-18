import common.ListNode;
import feb.AddTwoNumbers;
import feb.ReverserInteger;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author lyc1, lyc1@erongdu.com
 * @version 1.0.0
 * Copyright 杭州融都科技股份有限公司 All Rights Reserved
 * 官方网站：www.erongdu.com
 * <p>
 * 未经授权不得进行修改、复制、出售及商业使用
 * @since 2019-02-18
 */
public class JavaAlgorithmTest {


    @Test
    public void testReverseInteger() {
        Assert.assertEquals(89456, new ReverserInteger().reverse(65498));

        Assert.assertEquals(0, new ReverserInteger().reverse(1534236469));
    }

    @Test
    public void testAddTwoNumbers() {
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(4);
        l2.next = l3;
//        ListNode l1 = new ListNode(2);
//        l1.next = l2;

        ListNode r3 = new ListNode(4);
        ListNode r2 = new ListNode(6);
        r2.next = r3;
        ListNode r1 = new ListNode(5);
        r1.next = r2;


        ListNode node = AddTwoNumbers.addTwoNumbers(l2, r1);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

}
