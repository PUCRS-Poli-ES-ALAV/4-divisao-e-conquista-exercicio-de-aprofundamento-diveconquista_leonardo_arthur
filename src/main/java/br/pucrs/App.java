package br.pucrs;

import java.util.Arrays;

public class App {

	private int[] arrayValues;  


	public App(int[] inputArray){
		arrayValues = inputArray;
	}

	// recursive sorting function
	public int[] mergeSort(int[] A){
		if (A.length < 2){
			return A; 
		}
		else{                  
			int mid = A.length/2;      
			int[] left = new int[mid];  
			int[] right = new int[A.length-mid];
			System.arraycopy(A, 0, left, 0, mid);
			System.arraycopy(A, mid, right, 0, A.length-mid);
			left = mergeSort(left);  
			right = mergeSort(right);
			A = merge(left, right);  
			return A;		
		}


	}

	public int[] merge(int[] left, int[] right){
		int nL = left.length;
		int nR = right.length;
		int i = 0;
		int j = 0;
		int k = 0;
		int[] merged = new int[nL+nR];

		while( i < nL && j < nR ){
			if (left[i] <= right[j]){
				merged[k]=left[i];
				i++;
			}
			else{
				merged[k]=right[j];
				j++;
			}
			k++;
		}

		while(i < nL){
			merged[k]=left[i];
			i++;
			k++;
		}

		while(j < nR){
			merged[k]=right[j];
			j++;
			k++;
		}
		return merged;
	}

	//set  sorted array
	public void sortArray(){
		arrayValues = mergeSort(arrayValues); 
	}

	public void displayArray(){
		System.out.print(Arrays.toString(arrayValues)); 
	}

}