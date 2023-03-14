package br.pucrs;

import java.util.Arrays;

public class App2 {
    //   long maxVal1(long A[], int n) {  
    //     long max = A[0];
    //     for (int i = 1; i < n; i++) {  
    //         if( A[i] > max ) 
    //            max = A[i];
    //     }
    //     return max;
    // }
    private int[] arrayValues;

	public App2(int[] inputArray){
		arrayValues = inputArray; //constructor sets unsorted array
	}

    public long maxVal1(int[] arrayValues, int n) {
        long max = arrayValues[0];
        for (int i = 1; i < n; i++) {
            if (arrayValues[i] > max) max = arrayValues[i];
                max = arrayValues[i];
        }
        return max;
    }

    public void sortArray(){
		arrayValues = mergeSort(arrayValues); 
	}

	private int[] mergeSort(int[] arrayValues2) {
        return null;
    }

    public void displayArray(){
		System.out.print(Arrays.toString(arrayValues)); 
	}
    
    
}
