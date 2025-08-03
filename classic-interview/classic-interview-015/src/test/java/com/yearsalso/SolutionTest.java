package com.yearsalso;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Solution class unit tests
 *
 * @author yearsalso
 */
public class SolutionTest {

    private Solution solution = new Solution();

    /**
     * Test case: Empty array
     * Input: []
     * Expected: 0
     */
    @Test
    public void testCandyWithEmptyArray() {
        int[] ratings = {};
        int result = solution.candy(ratings);
        assertEquals(0, result);
    }

    /**
     * Test case: Single element
     * Input: [1]
     * Expected: 1
     */
    @Test
    public void testCandyWithSingleElement() {
        int[] ratings = {1};
        int result = solution.candy(ratings);
        assertEquals(1, result);
    }

    /**
     * Test case: Strictly increasing ratings
     * Input: [1,2,3]
     * Expected: 6 (1+2+3)
     */
    @Test
    public void testCandyWithIncreasingRatings() {
        int[] ratings = {1, 2, 3};
        int result = solution.candy(ratings);
        assertEquals(6, result);
    }

    /**
     * Test case: Strictly decreasing ratings
     * Input: [3,2,1]
     * Expected: 6 (3+2+1)
     */
    @Test
    public void testCandyWithDecreasingRatings() {
        int[] ratings = {3, 2, 1};
        int result = solution.candy(ratings);
        assertEquals(6, result);
    }

    /**
     * Test case: All equal ratings
     * Input: [2,2,2]
     * Expected: 3 (1+1+1)
     */
    @Test
    public void testCandyWithEqualRatings() {
        int[] ratings = {2, 2, 2};
        int result = solution.candy(ratings);
        assertEquals(3, result);
    }

    /**
     * Test case: Example 1 from problem description
     * Input: [1,0,2]
     * Expected: 5
     */
    @Test
    public void testCandyExample1() {
        int[] ratings = {1, 0, 2};
        int result = solution.candy(ratings);
        assertEquals(5, result);
    }

    /**
     * Test case: Example 2 from problem description
     * Input: [1,2,2]
     * Expected: 4
     */
    @Test
    public void testCandyExample2() {
        int[] ratings = {1, 2, 2};
        int result = solution.candy(ratings);
        assertEquals(4, result);
    }

    /**
     * Test case: Complex pattern with peaks and valleys
     * Input: [1,3,2,2,1]
     * Expected: 7 (1+2+1+2+1)
     */
    @Test
    public void testCandyWithPeakValleyPattern() {
        int[] ratings = {1, 3, 2, 2, 1};
        int result = solution.candy(ratings);
        assertEquals(7, result);
    }

    /**
     * Test case: Long increasing then decreasing sequence
     * Input: [1,2,3,4,3,2,1]
     * Expected: 16 (1+2+3+4+3+2+1)
     */
    @Test
    public void testCandyWithLongUpDownPattern() {
        int[] ratings = {1, 2, 3, 4, 3, 2, 1};
        int result = solution.candy(ratings);
        assertEquals(16, result);
    }

    /**
     * Test case: Complex pattern with multiple peaks and valleys
     * Input: [1,6,10,8,7,3,2]
     * Expected: 18 (1+2+5+4+3+2+1)
     */
    @Test
    public void testCandyWithComplexPattern() {
        int[] ratings = {1, 6, 10, 8, 7, 3, 2};
        int result = solution.candy(ratings);
        assertEquals(18, result);
    }
}
