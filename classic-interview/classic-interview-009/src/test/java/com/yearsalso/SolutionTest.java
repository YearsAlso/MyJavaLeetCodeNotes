package com.yearsalso;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void canJump_returnsTrue_whenCanReachEnd() {
        Solution solution = new Solution();
        int[] nums = {2, 3, 1, 1, 4};
        Assertions.assertTrue(solution.canJump(nums));
    }

    @Test
    void canJump_returnsFalse_whenCannotReachEnd() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 1, 0, 4};
        Assertions.assertFalse(solution.canJump(nums));
    }

    @Test
    void canJump_returnsTrue_whenSingleElement() {
        Solution solution = new Solution();
        int[] nums = {0};
        Assertions.assertTrue(solution.canJump(nums));
    }

    @Test
    void canJump_returnsFalse_whenZeroAtStartAndLengthGreaterThanOne() {
        Solution solution = new Solution();
        int[] nums = {0, 1};
        Assertions.assertFalse(solution.canJump(nums));
    }

    @Test
    void canJump_returnsTrue_whenAllElementsAreMaxJump() {
        Solution solution = new Solution();
        int[] nums = {5, 5, 5, 5, 5};
        Assertions.assertTrue(solution.canJump(nums));
    }

    @Test
    void canJump_returnsFalse_whenAllElementsAreZeroExceptFirst() {
        Solution solution = new Solution();
        int[] nums = {1, 0, 0, 0};
        Assertions.assertFalse(solution.canJump(nums));
    }

    @Test
    void canJump_returnsFalse_whenSomeElementsAreZeroExceptLast() {
        Solution solution = new Solution();
        int[] nums = {2, 0, 0};
        Assertions.assertTrue(solution.canJump(nums));
    }
}