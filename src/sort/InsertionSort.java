package sort;

public class InsertionSort implements Sort {

	public void sort(int[] array) {

		int len = array.length;
		int key = 0, j = 0;
		for (int i = 1; i < len; i++) {
			key = array[i];
			j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}
}
