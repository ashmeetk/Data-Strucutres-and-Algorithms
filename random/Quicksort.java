package random;

import java.util.Scanner;

public class Quicksort {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter the size of Array: ");
		int n = userInput.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < n; i++) {
			arr[i] = userInput.nextInt();
		}
		quicksort(arr, 0, n - 1);
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void quicksort(int[] arr, int l, int r) {
		if (l < r) {
			int m = partition(arr, l, r);
			quicksort(arr, l, m - 1);
			quicksort(arr, m + 1, r);
		}
	}

	public static int partition(int[] arr, int l, int r) {
		int pivot = arr[r];
		int i = -1;
		for (int j = 0; j < r; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		i++;
		swap(arr, i, r);
		return i;
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
