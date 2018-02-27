import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SelectionSort {

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
			selectionSort(arr, length);
			//selectionSort2(arr, length);
			for(int i = 0; i < length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}
	//find the maximum
	private static void selectionSort2(int[] arr, int length) {
		for(int i = length - 1; i > 0;i--) {
			int max = i;
			for(int j = i; j >= 0; j--) {
				if(arr[j] > arr[max]) {
  					max = j;
				}
			}
			swap(arr, i, max);
		}
	}
	// find the minimum
	private static void selectionSort(int[] arr, int length) {
		for(int i = 0; i < length - 1; i++) {
			int min = i;
			for(int j = i; j < length ; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			swap(arr, i, min);
		}
	}
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
