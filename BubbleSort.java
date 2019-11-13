public class BubbleSort {
 public static int compareTo(int cur, int com) {
        return cur - com;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args){
        int[] ls = {14, 5, 3, 5, 1, 3};
        int[] arr = bubbleSort(ls);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if(compareTo(arr[j], arr[j - 1]) < 0) {
                    swap(arr, j, j-1);
                }
            }
        }
        return arr;
    }
}
