package sort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] array1= {4,3,6,7,1,5,2,8};
		Sort bubbleSort=new BubbleSort();
		bubbleSort.sort(array1);
		System.out.println("Bubble Sort");
		System.out.println(Arrays.toString(array1));

		int[] array2= {44,22,66,55,11,88};
		Sort insertionSort=new InsertionSort();
		insertionSort.sort(array2);
		System.out.println("\nInsertion Sort");
		System.out.println(Arrays.toString(array2));

		int[] array3 = { 9, 3, 15, 6, 0 };
		Sort selectionSort = new SelectionSort();
		selectionSort.sort(array3);
		System.out.println("\nSelection Sort");
		System.out.println(Arrays.toString(array3));

		int[] array4 = { 2, 8, 10, 4, 6, 12 };
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(array4);
		System.out.println("\nMerge Sort");
		System.out.println(Arrays.toString(array4));

		int[] array5 = { 2, 11, 13, 7, 5, 23, 37 };
		QuickSort quickSort=new QuickSort();
		quickSort.sort(array5);
		System.out.println("\nQuick Sort");
		System.out.println(Arrays.toString(array5));
	}

}
