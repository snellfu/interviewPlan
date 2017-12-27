package Sort;

/**
 * Created with IntelliJ IDEA.
 * User: hot
 * Date: 17/12/22
 * Time: 下午4:16
 */
public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        int temp = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i < j && arr[j] >= temp) {
                j--;
            }
            arr[i] = arr[j];
            while (i < j && arr[i] <= temp) {
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = temp;

        if (i - 1 > low) {
            quickSort(arr, low, i - 1);
        }
        if (i + 1 < high) {
            quickSort(arr, i + 1, high);
        }

    }


    public static void main(String[] args) {
        int[] p = {30, 21,21, 54, 18, 23, 76, 38, 98, 45, 33, 27, 51, 11, 20, 79,
                30, 89, 41};
        quickSort(p, 0, p.length - 1);
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + " ");
        }
    }
}
