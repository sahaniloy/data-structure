package com.example.ds.sort;

import java.util.Arrays;

/**
 * 1. Selection sort is in-place algo, doesn't need any extra space
 * 2. Unstable in nature, because it doesn't maintain the relative position of the element in array.
 * 3. Time complexity of this algo is Quadratic i.e. O(n^2)
 *
 * @author Niloy Saha<niloysaha@gmail.com>
 */
public class SelectionSort {
    public static void main(String[] args) {
        insertionSort();
    }

    private static void insertionSort() {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        int largest;

        //We will assume unsortedIndex is the last element of the array.
        //We will assume the largest element is 0th element of the array then compare each element with the largest
        //if any element is greater than largest then we will swap largest element with the unsorted index element
        //After the first iteration largest element will be fixed at the last of the array
        for (int unsortedIndex = array.length - 1; unsortedIndex > 0; unsortedIndex--) {
            largest = 0;
            for (int i = 1; i <= unsortedIndex; i++) {
                if (array[largest] < array[i]) {
                    largest = i;
                }

                swap(array, largest, unsortedIndex);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
