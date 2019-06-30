package com.example.ds.sort;

import java.util.Arrays;

/**
 * 1. Speed of this algorithm will degrades fast, as soon as the number of element increases
 *    Time complexity of this algo is Quadratic i.e. O(n^2)
 *
 * 2. Bubble sort is "Stable Sort" algorithm. Because it maintains the relative order of the elements
 *    If a sort algorithm doesn't maintain the relative order of the elements then that sort algorithm is called
 *    "Unstable Sort" algo
 *
 *
 * @author Niloy Saha<niloysaha@gmail.com>
 */
public class BubbleSort {

    public static void main(String[] args) {
        bubbleSort();
    }

    private static void bubbleSort() {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        //We will assume unsortedIndex is the last element of the array.
        //After the first iteration the biggest element will move to the last of the array
        //Then we will reduce the unsortedIndex by 1
        for (int unsortedIndex = array.length - 1; unsortedIndex > 0; unsortedIndex--) {
            for (int i = 0; i < unsortedIndex; i++) {
                //Check the element is greater than the next element in array
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
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
