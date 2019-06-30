package com.example.ds.sort;

import java.util.Arrays;

/**
 * This algorithm sorts the array by inserting an element to its correct position. Hence the name insertion sort.
 * Time complexity of this algo is Quadratic i.e. O(n^2)
 *
 * @author Niloy Saha<niloysaha@gmail.com>
 */
public class InsertionSort {

    public static void main(String[] args) {
        insertionSort();
    }

    private static void insertionSort() {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        //At very first, we will assume 0th element is always sorted element and keep on increasing the sorted elements list from left to right
        //We also assume first unsorted element is at position 1, then keep on incrementing unsorted element index by 1
        //In every iteration sorted elements list from left to right will grow
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            //Store the first unsorted element in a temporary variable
            int newElement = array[firstUnsortedIndex];
            int i;

            //Will check whether each element at sorted side is greater than the element at first unsorted index
            // if yes, then we will shift the element
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }

        System.out.println(Arrays.toString(array));
    }
}
