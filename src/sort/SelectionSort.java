package sort;

public class SelectionSort implements Sort {

	public void sort(int[] array) {
		int len = array.length;
		int min_idx = 0, temp = 1;
		for (int i = 0; i < len - 1; i++) {
			min_idx = i;
			for (int j = i + 1; j < len; j++) {
				if (array[j] < array[min_idx]) {
					min_idx = j;
				}
			}
			temp = array[min_idx];
			array[min_idx] = array[i];
			array[i] = temp;
		}

	}
}
