package com.wole.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Medium {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode init = new ListNode(0);
        ListNode curr = init;
        int carry = 0;

        while(l1 != null || l2 != null){
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = carry + x + y;

            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null){
                l1 = l1.next;
            }

            if (l2 != null){
                l2 = l2.next;
            }
        }
        if (carry > 0){
            curr.next = new ListNode(carry);
        }
        return init.next;
    }
    public String largestTimeFromDigits(int[] arr) {
        // Arrays.sort(arr, Collections.reverseOrder());

        return "You";
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dupes = new ArrayList<>();
        int size = nums.length;

        // O(n) space
        int[] count = new int[size+1];
        for(int i = 0; i < size; i++){
            if (count[nums[i]] == 0){
                count[nums[i]]++;
            }
            else{
                dupes.add(nums[i]);
            }
        }
        return dupes;
    }
}
