package com.codecool.sort;

public class BubbleSort {
    public void sort(int[] array) {
        boolean isSorted;
        for(int i= 0 ; i < array.length; i++){
            isSorted = true;
            for(int j = 1 ; j < array.length- i; j++){
                if(array[j] < array[j -1 ]){
                    swap(array, j, j -1);
                    isSorted = false;
                }
            }
            if(isSorted){
                return;
            }
        }
    }

    private void swap(int[] array, int index1 , int index2){
      int temp = array[index1];
      array[index1] = array[index2];
      array[index2] = temp;
    }
}
//Big O notation 
//            Best    Worst
//Passes       O(1)     O(n)
//Comparisons  O(n)     O(n)
//Total        O(n)     O(n2)
//            Linear    Quadratic