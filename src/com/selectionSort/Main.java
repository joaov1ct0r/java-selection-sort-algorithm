package com.selectionSort;

import com.selectionSort.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 7, 8, 34, 90, 1, 0, 1, 0, 89, 54};

        SelectionSort selectionSort = new SelectionSort();

        selectionSort.execute(array);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}