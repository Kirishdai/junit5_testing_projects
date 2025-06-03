package com.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the SortingArray class.
 */
class SortingArrayTest {

    SortingArray array = new SortingArray();

    /**
     * Test that the sorting method returns the array sorted in ascending order.
     */
    @Test
    void testSortingArray_shouldSortCorrectly() {
        int[] input = {4, 1, 3, 2};
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, array.sortingArray(input));
    }

    /**
     * Test that passing a null array throws a NullPointerException.
     */
    @Test
    void testSortingArray_withNullArray_shouldThrowException() {
        assertThrows(NullPointerException.class, () -> array.sortingArray(null));
    }
}
