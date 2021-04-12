// https://www.vogella.com/tutorials/JUnit/article.html

package com.wole.Leetcode.UnitTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.wole.Leetcode.Easy;

public class EasyTest {
    Easy easy;

    @BeforeEach
    public void Setup(){
        easy = new Easy();
    }

    @Test
    @DisplayName("Two sums should return array")
    public void TestTwoSums() throws Exception{
        // Arrange
        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        int[] expected = new int[]{0, 1};

        //Act
        int[] actual = easy.TwoSum(nums, target);

        //Assert
        Assertions.assertAll("TestTwoSums", () -> Assertions.assertArrayEquals(expected, actual),
                () -> Assertions.assertArrayEquals(new int[]{1, 2}, easy.TwoSum(new int[]{3,2,4}, 6)),
                () -> Assertions.assertArrayEquals(new int[]{0, 1}, easy.TwoSum(new int[]{3,3}, 6)));
    }

    @Test
    @DisplayName("Two sums should return array for negatives")
    public void TestTwoSumsNegativeInputs() throws Exception {
        // Arrange
        int[] nums = new int[]{-3,4,3,90};
        int target = 0;

        //Act
        int[] actual = easy.TwoSum(nums, target);
        int[] expected = new int[]{0, 2};

        //Assert
        Assertions.assertArrayEquals(expected, actual);
    }
}
