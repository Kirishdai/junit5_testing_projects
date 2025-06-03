package com.learning;

import java.util.Arrays;

/**
 * Utility class that provides sorting functionality for integer arrays.
 */
public class SortingArray {

    /**
     * Sorts the input array in ascending order using Java's built-in Arrays.sort().
     *
     * @param array the array of integers to sort
     * @return the sorted array in ascending order
     */
    public int[] sortingArray(int[] array) {
        Arrays.sort(array); // Sorts the array in-place
        return array;
    }
}
