package Query;

/**
 * Created with IntelliJ IDEA.
 * User: hot
 * Date: 17/12/21
 * Time: 下午5:27
 * 二分法查找
 */
public class BinaryQuery {

    /**
     * 循环
     *
     * @param array
     * @param value
     * @return
     */
    public static Integer queryCirculation(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        int middle;

        while (low <= high) {
            middle = (low + high) / 2;
            if (value < array[middle]) {
                high = middle - 1;
            } else if (value > array[middle]) {
                low = middle + 1;
            } else {
                return array[middle];
            }

        }
        return null;
    }


    /**
     * 递归
     *
     * @param array
     * @param value
     * @param low
     * @param high
     * @return
     */
    public static Integer queryRecursive(int[] array, int value, int low, int high) {
        if (high > low) {
            return null;
        }
        int middle = (low + high) / 2;
        if (value > array[middle]) {
            queryRecursive(array, value, middle + 1, high);
        } else if (value < array[middle]) {
            queryRecursive(array, value, low, middle - 1);

        } else {
            return array[middle];
        }
        return null;
    }
}
