package sort;

public class MergeSort implements Sort {

	public void sort(int[] array) {

		if (array.length <= 1) {
			return;
		}

		int[] temp = new int[array.length];
		mergeSort(array, temp, 0, array.length - 1);
	}

	private int[] mergeSort(int[] arr, int[] temp, int left, int right) {

		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(arr, temp, left, mid);
			mergeSort(arr, temp, mid + 1, right);
			merge(arr, temp, left, mid, right);
		}
		return arr;
	}

	private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int k = left;

		while (i <= mid && j <= right) {
			if (arr[i] <= arr[j]) {
				temp[k] = arr[i];
				i++;
			} else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}

		while (i <= mid) {
			temp[k] = arr[i];
			k++;
			i++;
		}

		while (j <= right) {
			temp[k] = arr[j];
			k++;
			j++;
		}

		for (k = left; k <= right; k++) {
			arr[k] = temp[k];
		}
	}
}
