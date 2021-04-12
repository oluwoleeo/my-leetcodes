package com.wole.Leetcode.UnitTests;

import com.wole.Leetcode.ListNode;
import com.wole.Leetcode.Medium;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MediumTest {
    Medium medium;

    @BeforeEach
    public void Setup(){
        medium = new Medium();
    }

    @Test
    @DisplayName("Add two numbers")
    public void AddTwoNumbers(){
        // Arrange
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(8);

        // Act
        ListNode actual = medium.addTwoNumbers(l1, l2);

        //Assert
        Assertions.assertAll("TestTwoSums", () -> Assertions.assertEquals(expected.val, actual.val),
                () -> Assertions.assertEquals(expected.next.val, actual.next.val),
                () -> Assertions.assertEquals(expected.next.next.val, actual.next.next.val));
    }
}
