import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) throws FileNotFoundException {

		
		String fileName = "hw3.dat";
		Scanner s = new Scanner(new FileReader(fileName));
		int length = s.nextInt();
		if(length <= 0)
			System.out.print("The file do not have any number need to be sort!");
		else if (length == 1) {
			int number = s.nextInt();
			System.out.print(number);
		}else {
			int[] arr = new int[length];
			for(int i = 0; i < length; i++) {
				arr[i] = s.nextInt();
			}
			quickSort(arr, 0, length - 1);
			for(int i = 0; i < length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}
	private static void quickSort(int[] arr, int left, int right) {
		int pivot = (arr[left] + arr[right]) / 2;
		if(left >= right)
			return;
		else {
			int i = left;
			int j = right;
			while(i < j) {
				while(arr[i] < pivot) {
					i++;
				}
				while(arr[j] > pivot) {
					j--;
				}
				swap(arr, i, j);
			}
			quickSort(arr, left, i);
			quickSort(arr, i + 1, right);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
