package com.yearsalso;

import com.yearsalso.Solution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    /**
     * Test case 1: Normal case with mixed elements
     * Input: nums = [3,2,2,3], val = 3
     * Expected: k = 2, nums = [2,2,...]
     */
    @Test
    void testRemoveElement_NormalCase() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int expectedK = 2;
        int actualK = solution.removeElement(nums, val);

        assertEquals(expectedK, actualK);
        // Check first k elements are not equal to val
        for (int i = 0; i < expectedK; i++) {
            assertNotEquals(val, nums[i]);
        }
    }

    /**
     * Test case 2: All elements match val
     * Input: nums = [2,2,2], val = 2
     * Expected: k = 0
     */
    @Test
    void testRemoveElement_AllMatch() {
        int[] nums = {2, 2, 2};
        int val = 2;
        int expectedK = 0;
        int actualK = solution.removeElement(nums, val);

        assertEquals(expectedK, actualK);
    }

    /**
     * Test case 3: No elements match val
     * Input: nums = [1,2,3], val = 4
     * Expected: k = 3
     */
    @Test
    void testRemoveElement_NoneMatch() {
        int[] nums = {1, 2, 3};
        int val = 4;
        int expectedK = 3;
        int actualK = solution.removeElement(nums, val);

        assertEquals(expectedK, actualK);
        // All elements should remain unchanged
        assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

    /**
     * Test case 4: Empty array
     * Input: nums = [], val = 0
     * Expected: k = 0
     */
    @Test
    void testRemoveElement_EmptyArray() {
        int[] nums = {};
        int val = 0;
        int expectedK = 0;
        int actualK = solution.removeElement(nums, val);

        assertEquals(expectedK, actualK);
    }

    /**
     * Test case 5: Single element matches
     * Input: nums = [1], val = 1
     * Expected: k = 0
     */
    @Test
    void testRemoveElement_SingleElementMatch() {
        int[] nums = {1};
        int val = 1;
        int expectedK = 0;
        int actualK = solution.removeElement(nums, val);

        assertEquals(expectedK, actualK);
    }

    /**
     * Test case 6: Single element does not match
     * Input: nums = [1], val = 2
     * Expected: k = 1
     */
    @Test
    void testRemoveElement_SingleElementNotMatch() {
        int[] nums = {1};
        int val = 2;
        int expectedK = 1;
        int actualK = solution.removeElement(nums, val);

        assertEquals(expectedK, actualK);
        assertEquals(1, nums[0]);
    }
}
