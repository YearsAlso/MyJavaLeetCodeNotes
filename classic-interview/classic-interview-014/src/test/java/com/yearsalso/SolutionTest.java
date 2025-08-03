package com.yearsalso;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canCompleteCircuit_ReturnsCorrectStartIndex_WhenSolutionExists() {
        Solution solution = new Solution();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        assertEquals(3, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    void canCompleteCircuit_ReturnsMinusOne_WhenNoSolutionExists() {
        Solution solution = new Solution();
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};
        assertEquals(-1, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    void canCompleteCircuit_ReturnsZero_WhenOnlyOneStationAndEnoughGas() {
        Solution solution = new Solution();
        int[] gas = {5};
        int[] cost = {4};
        assertEquals(0, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    void canCompleteCircuit_ReturnsMinusOne_WhenOnlyOneStationAndNotEnoughGas() {
        Solution solution = new Solution();
        int[] gas = {1};
        int[] cost = {2};
        assertEquals(-1, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    void canCompleteCircuit_ReturnsCorrectIndex_WhenMultiplePossibleStartsButOnlyOneValid() {
        Solution solution = new Solution();
        int[] gas = {2, 3, 1};
        int[] cost = {3, 1, 2};
        assertEquals(1, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    void canCompleteCircuit_ReturnsMinusOne_WhenAllStationsHaveZeroGas() {
        Solution solution = new Solution();
        int[] gas = {0, 0, 0};
        int[] cost = {1, 1, 1};
        assertEquals(-1, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    void canCompleteCircuit_ReturnsZero_WhenAllStationsHaveZeroCost() {
        Solution solution = new Solution();
        int[] gas = {1, 2, 3};
        int[] cost = {0, 0, 0};
        assertEquals(0, solution.canCompleteCircuit(gas, cost));
    }
}