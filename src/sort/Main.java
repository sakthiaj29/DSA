package sort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
//		int[] array1= {4,3,6,7,1,5,2,8};
//		Sort bubbleSort=new BubbleSort();
//		bubbleSort.sort(array1);
//		System.out.println("Bubble Sort");
//		System.out.println(Arrays.toString(array1));
		
//		int[] array2= {44,22,66,55,11,88};
//		Sort insertionSort=new InsertionSort();
//		insertionSort.sort(array2);
//		System.out.println("Insertion Sort");
//		System.out.println(Arrays.toString(array2));
		
		int[] array3= {9,3,15,6,0};
		Sort selectionSort=new SelectionSort();
		selectionSort.sort(array3);
		System.out.println("Selection Sort");
		System.out.println(Arrays.toString(array3));
	}

}
