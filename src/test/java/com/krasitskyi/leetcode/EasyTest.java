package com.krasitskyi.leetcode;

import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EasyTest {
    Easy easy;
    SoftAssertions softAssert;

    @BeforeClass
    public void setUp() {
        easy = new Easy();
        softAssert = new SoftAssertions();
    }

    @Test
    public void testTwoSum() {

        List<int[]> actualArraysList = new ArrayList<>();
        actualArraysList.add(new int[]{2, 7, 11, 15});
        actualArraysList.add(new int[]{3, 2, 4});
        actualArraysList.add(new int[]{3, 3});
        List<Integer> actualTargetList = Arrays.asList(9, 6, 6);
        List<int[]> expectedResultsList = Arrays.asList(
                new int[]{0, 1},
                new int[]{1, 2},
                new int[]{0, 1});

        for (int i = 0; i < actualArraysList.size(); i++) {
            softAssert.assertThat(easy.twoSum(actualArraysList.get(i), actualTargetList.get(i)))
                    .isEqualTo(expectedResultsList.get(i));
        }
        softAssert.assertAll();
    }

    @Test
    public void testMerge() {

        List<int[]> actualArrays1 = Arrays.asList(
                new int[]{1, 2, 3, 0, 0, 0},
                new int[]{1},
                new int[]{0}
        );
        List<Integer> actualSizesArrays1 = Arrays.asList(3, 1, 0);
        List<int[]> actualArrays2 = Arrays.asList(
                new int[]{2, 5, 6},
                new int[]{},
                new int[]{1}
        );
        List<Integer> actualSizesArrays2 = Arrays.asList(3, 0, 1);
        List<int[]> expectedArrays = Arrays.asList(
                new int[]{1, 2, 2, 3, 5, 6},
                new int[]{1},
                new int[]{1}
        );

        for (int i = 0; i < actualArrays1.size(); i++) {
            easy.merge(actualArrays1.get(i), actualSizesArrays1.get(i), actualArrays2.get(i), actualSizesArrays2.get(i));
            softAssert.assertThat(actualArrays1.get(i))
                    .isEqualTo(expectedArrays.get(i));
        }
        softAssert.assertAll();
    }

    @Test
    public void testRemoveElement() {
        List<int[]> actualArrays = Arrays.asList(
                new int[]{3, 2, 2, 3},
                new int[]{0, 1, 2, 2, 3, 0, 4, 2}
        );
        List<Integer> actualValue = Arrays.asList(3, 2);
        List<int[]> expectedArrays = Arrays.asList(
                new int[]{2, 2},
                new int[]{0, 1, 0, 4, 3}
        );

        for (int i = 0; i < actualArrays.size(); i++) {
            int actualResult = easy.removeElement(actualArrays.get(i), actualValue.get(i));
            int[] actualArray = Arrays.copyOf(actualArrays.get(i), actualResult);
            softAssert.assertThat(actualArray).isEqualTo(expectedArrays.get(i));
        }
        softAssert.assertAll();
    }

    @Test
    public void testRemoveDuplicates() {
        List<int[]> actualArrays = Arrays.asList(
                new int[]{1, 1, 2},
                new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}
        );
        List<int[]> expectedArrays = Arrays.asList(
                new int[]{1, 2},
                new int[]{0, 1, 2, 3, 4}
        );

        for (int i = 0; i < actualArrays.size(); i++) {
            int actualResult = easy.removeDuplicates(actualArrays.get(i));
            softAssert.assertThat(actualResult)
                    .isEqualTo(expectedArrays.get(i).length);
            int[] actualArray = Arrays.copyOf(actualArrays.get(i), actualResult);
            softAssert.assertThat(actualArray)
                    .isEqualTo(expectedArrays.get(i));
        }
        softAssert.assertAll();
    }

    @Test
    public void testMajorityElement() {
        List<int[]> actualArrays = Arrays.asList(
                new int[]{3, 2, 3},
                new int[]{2, 2, 1, 1, 1, 2, 2}
        );
        List<Integer> expectedResult = Arrays.asList(3, 2);

        for (int i = 0; i < actualArrays.size(); i++) {
            softAssert.assertThat(easy.majorityElement(actualArrays.get(i)))
                    .as("Case " + (i + 1) + ": result doesn't match")
                    .isEqualTo(expectedResult.get(i));
        }
        softAssert.assertAll();
    }
}
