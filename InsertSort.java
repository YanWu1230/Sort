package sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
//        int[] arr = new int[]{3, 4, 5, 1, 2};
//        insertSort(arr);
//        int[] arr = new int[]{2, 1, 3 , 5, 6};
        int[] arr = new int[]{3, 7, 2, 1, 5};
        binaryInsertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }

        }
    }

    public static void binaryInsertSort(int[] arr) {
        for(int i = 0; i < arr.length -1; i++) {
            int temp = arr[i + 1];
            int low = 0;
            int high = i;
            while(low <= high) {
                int mid = low + (high - low) / 2;
                if(arr[mid] < temp) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            for(int j = i; j > high; j--) {
                arr[j + 1] = arr[j];
            }
            arr[high+ 1] = temp;
        }
    }
}
