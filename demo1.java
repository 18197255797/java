package package11;
import java.util.Stack;
public class demo1 {
    public static void quickSort(int[] array) {

        quickSortInternal(array, 0, array.length - 1);
    }
    // [left, right] 为待排序区间
    private static void quickSortInternal(int[] array, int left, int right) {
        if (left == right) {
            return;
        }
        if (left > right) {
            return;
        }
        // 最简单的选择基准值的方式，选择 array[left] 作为基准值
        // pivotIndex 代表基准值最终停留的下标
        int pivotIndex = partition(array,left, right);
        // [left, pivotIndex - 1] 都是小于等于基准值的
        // [pivotIndex + 1, right] 都是大于等于基准值的
        quickSortInternal(array, left, pivotIndex - 1);
        quickSortInternal(array, pivotIndex + 1, right);
    }
    private static int partition(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int pivot = array[left];
        while (i < j) {
            while (i < j && array[j] >= pivot) {
                j--;
            }
            while (i < j && array[i] <= pivot) {
                i++;
            }

            swap(array, i, j);
        }
        swap(array, i, left);
        return i;
    }
    public static void swap(int []array,int x, int y) {
    int tmp = array[x];
    array[x] = array[y];
    array[y] = tmp;
    }
    //非递归版本的快速排序
    public static void quickSortByLoop(int[] array){
        //先创建一个栈，栈里面存的是待处理区间的下标、
        Stack<Integer> stack = new Stack<>();
        stack.push(array.length-1);
        stack.push(0);
        while(!stack.isEmpty()){
            //取出栈顶元素
            int left = stack.pop();
            int right = stack.pop();
            if (left >= right) {
                continue;
            }
            int pivotIndex = partition(array, left, right);
            stack.push(right);
            stack.push(pivotIndex + 1);
            stack.push(pivotIndex - 1);
            stack.push(left);
        }
    }
}
