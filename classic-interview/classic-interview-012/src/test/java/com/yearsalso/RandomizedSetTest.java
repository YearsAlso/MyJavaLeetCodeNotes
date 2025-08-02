package com.yearsalso;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Unit tests for RandomizedSet class.
 * Tests cover all public methods: insert, remove, getRandom.
 */
class RandomizedSetTest {

    private RandomizedSet randomizedSet;

    @BeforeEach
    void setUp() {
        randomizedSet = new RandomizedSet();
    }

    // Test insert method
    @Test
    void testInsert() {
        assertTrue(randomizedSet.insert(1)); // Should return true
        assertFalse(randomizedSet.insert(1)); // Should return false as 1 already exists
        assertTrue(randomizedSet.insert(2)); // Should return true
    }

    // Test remove method
    @Test
    void testRemove() {
        randomizedSet.insert(1);
        randomizedSet.insert(2);

        assertTrue(randomizedSet.remove(1)); // Should return true
        assertFalse(randomizedSet.remove(3)); // Should return false as 3 does not exist
        assertFalse(randomizedSet.remove(1)); // Should return false as 1 is already removed
    }

    // Test getRandom method when only one element exists
    @Test
    void testGetRandomWithOneElement() {
        randomizedSet.insert(42);
        for (int i = 0; i < 100; i++) {
            assertEquals(42, randomizedSet.getRandom());
        }
    }

    // Test getRandom method with multiple elements
    @Test
    void testGetRandomWithMultipleElements() {
        randomizedSet.insert(1);
        randomizedSet.insert(2);
        randomizedSet.insert(3);

        Set<Integer> results = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            results.add(randomizedSet.getRandom());
        }

        assertTrue(results.contains(1));
        assertTrue(results.contains(2));
        assertTrue(results.contains(3));
    }

    // Test combined operations
    @Test
    void testCombinedOperations() {
        assertTrue(randomizedSet.insert(1)); // true
        assertFalse(randomizedSet.remove(2)); // false
        assertTrue(randomizedSet.insert(2)); // true

        int random = randomizedSet.getRandom(); // should be 1 or 2
        assertTrue(random == 1 || random == 2);

        assertTrue(randomizedSet.remove(1)); // true
        assertFalse(randomizedSet.insert(2)); // false

        assertEquals(2, randomizedSet.getRandom()); // only 2 left
    }
}
