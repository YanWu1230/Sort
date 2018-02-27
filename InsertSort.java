import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InsertSort {

	
		public static void main(String[] args) throws FileNotFoundException {
			int num = 0;
			//read the input file
			Scanner s = new Scanner(new FileReader("HW3.dat"));
			//obtain the length of the total number
			num = s.nextInt();
			//judge if it is necessary to create an array
			if(num >= 1 || num % 1 == 0) {
				int[] arr = new int[num + 1];
				for(int i = 1; i <= num; i++) {
					arr[i] = s.nextInt();
				}
			insertSort(arr, num);
			for(int i = 1; i < num + 1; i++) {
				System.out.print(arr[i] + " ");
			}
			}else {
				System.out.println("Input Error");
			}
	}
		private static void insertSort(int[] arr, int num) {
			for(int i = 0; i < num - 1; i++) {
				for(int j = i + 2; j > 1; j--) {
					arr[0] = arr[j];
					if(arr[j] < arr[j - 1])
						swap(arr, j);
				}
			}
		}
		
		private static void swap(int[] arr, int j) {
			arr[j] = arr[j - 1];
			arr[j - 1] = arr[0];
		}

}
 