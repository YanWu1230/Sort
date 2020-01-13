package sort;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        System.out.println("merge sort");
        int[] arr = {5,2,9,4,7,6,1,3,8};
        mergeSrot(arr, 0, arr.length - 1);
    }

    public static int[] mergeSrot(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if(low < high) {
            mergeSrot(arr, low, mid);
            mergeSrot(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
        return arr;
    }

    public static int[] merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= high){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= high) {
            temp[k++] = arr[j++];
        }
        for(int x = 0; x < temp.length; x++) {
            arr[x + low] = temp[x];
        }
        System.out.println("current result: " + Arrays.toString(temp));
        return arr;
    }
}
