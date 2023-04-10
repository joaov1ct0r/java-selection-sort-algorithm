package com.selectionSort;

public class SelectionSort {

    protected void execute(int[] arr) {
        int lowestValue, lowestValueIndex;

        for(int i = 0; i < arr.length - 1; i++) {
            lowestValue = arr[i];
            lowestValueIndex = i;

            for(int j = i; j < arr.length; j++) {
                if(arr[j] < lowestValue) {
                    lowestValue = arr[j];
                    lowestValueIndex = j;
                }
            }
            if(i != lowestValueIndex) {
                int temp = arr[i];
                arr[i] = arr[lowestValueIndex];
                arr[lowestValueIndex] = temp;
            }

        }
    }
}
