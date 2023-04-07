package com.selectionSort;

public class SelectionSort {

    protected void execute(int[] arr) {
        int lowestValue, lowestValueIndex;

        for(int i = 0; i < arr.length - 1; i++) {
            //Find the lowest
            lowestValue = arr[i];
            lowestValueIndex = i;

            for(int j = i; j < arr.length; j++) {
                if(arr[j] < lowestValue) {
                    lowestValue = arr[j];
                    lowestValueIndex = j;
                }
            }
            //Swap
            if(i != lowestValueIndex) {
                int temp = arr[i];
                arr[i] = arr[lowestValueIndex];
                arr[lowestValueIndex] = temp;
            }

        }
    }
}
