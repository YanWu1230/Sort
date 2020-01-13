package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5,2,9,4,7,6,1,3,8};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
    public static void quickSort(int[] nums, int left, int right) {
        if(left < right) {
            int pivot = partition(nums, left, right);
            quickSort(nums, left, pivot);
            quickSort(nums, pivot+1, right);
        }
    }
    public static int partition(int[] nums, int left, int right) {
        int pivotIndex = left;
        int pivot = nums[pivotIndex];
        int l = left + 1; // the first compare element at left side
        int r = right; // the first compare element at right side
        System.out.println("pivot: " + pivot + " " + Arrays.toString(nums));
        System.out.println("pivotIndex : " + pivotIndex + " l: " + l + " r: " + r);
        while (l <= r) {
            if (nums[l] > pivot && nums[r] < pivot) {
                swap(nums, l, r);
            }
            if(nums[l] <= pivot) l++;
            if(nums[r] >= pivot) r--;
            System.out.println("current arrays: " + Arrays.toString(nums));
        }
        // exchange the pivot with the final
        swap(nums, pivotIndex, r);
        System.out.println("This is the end for this round.");
        return r;
    }

    public static void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
