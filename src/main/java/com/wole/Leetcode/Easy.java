package com.wole.Leetcode;

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
}
