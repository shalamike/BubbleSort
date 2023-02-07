package org.sparta;

public class BubbleSort {

    public int[] arrToBeSorted(int[] arrayToSort){
        int placeholder;
        int arraySize = arrayToSort.length;
        for(int i = 1; i < arraySize; i++){
            for (int j= 0; j<arraySize-1; j++){
                if (arrayToSort[j]>arrayToSort[j+1]){
                    placeholder = arrayToSort[j+1];
                    arrayToSort[j+1] = arrayToSort[j];
                    arrayToSort[j] = placeholder;
                }
            }
        }
        return arrayToSort;
    }
}
