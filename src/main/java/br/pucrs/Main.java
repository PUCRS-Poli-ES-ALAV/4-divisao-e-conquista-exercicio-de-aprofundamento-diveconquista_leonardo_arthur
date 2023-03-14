package br.pucrs;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Random rd = new Random(); // creating Random object
	
		int[] arr = new int[32];
		for (int i = 0; i < arr.length; i++) {
		   arr[i] = rd.nextInt(); // storing random integers in an array
		}

		App subjectArray = new App(arr);
		System.out.println("\nEX.1");

		subjectArray.sortArray();
		subjectArray.displayArray();


		App2 ordenaArray = new App2(arr);
		ordenaArray.maxVal1(arr, 32);
		System.out.println("\n\nEX.2");
		ordenaArray.displayArray();
	}

}