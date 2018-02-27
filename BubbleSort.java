import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) throws FileNotFoundException {
		int num = 0;
		//read the input file
		Scanner s = new Scanner(new FileReader("HW3.dat"));
		//obtain the length of the total number
		num = s.nextInt();
		//judge if it is necessary to create an array
		if(num >= 1 || num % 1 == 0) {
			int[] arr = new int[num];
			for(int i = 0; i < num; i++) {
				arr[i] = s.nextInt();
				
			}
			bubbleSort(arr);
			for(int i = 0; i < num; i++) {
				System.out.print(arr[i]+" ");
			}
		}else {
			System.out.println("Input Error");
		}
		
	}

	public static int[] bubbleSort(int[] arr) {
		int num = arr.length;
		for(int i = num - 1; i > 1; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j+1])
					swap(arr,j);
			}
		}
		
		
		
		return arr;
	}
	
	private static void swap(int[] arr,  int j) {
		int temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;
	}

}
