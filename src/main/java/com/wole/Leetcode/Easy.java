package com.wole.Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Easy {
    public int[] TwoSum(int[] nums, int target) throws Exception {
        for(int i = 0; i < nums.length-1; i++ ){
            for(int j = i+1; j < nums.length; j++){
                if (nums[i] == target - nums[j]){
                    return new int[]{i, j};
                }
            }
        }
        throw new Exception("No two arguments found");
    }

    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int rem = x % 10;
            x /= 10;

            if (rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
                return 0;
            }
            rev = (10 * rev) + rem;
        }
        return rev;
    }

    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String[] strs = str.split("");

        int high = strs.length - 1;

        for (int i = 0; i <= strs.length/2; i++){
            if (!strs[i].equals(strs[high])){
                return false;
            }
            high--;
        }
        return true;
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> romansArr = new HashMap<Character, Integer>();
        romansArr.put('I', 1);
        romansArr.put('V', 5);
        romansArr.put('X', 10);
        romansArr.put('L', 50);
        romansArr.put('C', 100);
        romansArr.put('D', 500);
        romansArr.put('M', 1000);

        int sum = 0;

        /* String[] rArr = s.split("");
        for (String e: rArr){
            int val = romansArr.get(e);
            if ( val > sum){
                sum = val - sum;
            }
            else{
                sum += val;
            }
        } */

        for (int i = 0; i < s.length(); i++){
            int x = romansArr.get(s.charAt(i));

            if (i+1 < s.length()){
                int y = romansArr.get(s.charAt(i+1));

                if (x < y){
                    sum = sum + y -x;
                    i++;
                }
                else{
                    sum += x;
                }
            }
            else{
                sum += x;
            }
        }
        return sum;
    }
}
