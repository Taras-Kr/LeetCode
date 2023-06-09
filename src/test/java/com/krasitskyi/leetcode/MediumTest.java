package com.krasitskyi.leetcode;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MediumTest {
    Medium medium;
    SoftAssertions softAssert;

    @BeforeClass
    public void setUp() {
        medium = new Medium();
        softAssert = new SoftAssertions();
    }

    @Test
    public void testRemoveDuplicates() {
        List<Integer> expectedResults = Arrays.asList(5, 7, 2, 6, 6);
        List<int[]> expectedArrays = Arrays.asList(
                new int[]{1, 1, 2, 2, 3},
                new int[]{0, 0, 1, 1, 2, 3, 3},
                new int[]{1, 1},
                new int[]{-3, -1, -1, 0, 0, 2},
                new int[]{0, 0, 1, 1, 3, 3}
        );
        List<int[]> actualArrays = Arrays.asList(
                new int[]{1, 1, 1, 2, 2, 3},
                new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3},
                new int[]{1, 1, 1, 1},
                new int[]{-3, -1, -1, 0, 0, 0, 0, 0, 2},
                new int[]{0, 0, 1, 1, 1, 1, 3, 3, 3, 3, 3}
        );

        for (int i = 0; i < actualArrays.size(); i++) {
            softAssert.assertThat(medium.removeDuplicates(actualArrays.get(i)))
                    .as("Case " + (i + 1) + ": result doesn't match")
                    .isEqualTo(expectedResults.get(i));

            for (int j = 0; j < expectedArrays.get(i).length; j++) {
                softAssert.assertThat(actualArrays.get(i)[j])
                        .as("Case " + (i + 1) + ": elements in " + j + " position doesn't match")
                        .isEqualTo(expectedArrays.get(i)[j]);
            }
        }
        softAssert.assertAll();
    }
}
