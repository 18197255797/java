package package11;

import java.util.Arrays;

public class demo2 {

    //归并两个有序链表   变成一个有序链表
    //9 5 2 7     3 6 8 4
    //新的数组保存归并的结果
    public static void mergeSort(int []array){
        //后两个参数表示要进行归并排序的区间
        //[0,array.length)
        mergeSortHelper(array,0,array.length);

    }
    public static void  mergeSortHelper(int[]array,int left,int right){
        //[left,right)构成了要去进行归并排序的区间
        //如果区间为空 或只有一个元素 不用排序
        if(left >= right || right - left ==1){
            return;
        }
        //使用类似于后序遍历的方法
        //先把当前的待排序区间拆成两半
        //递归对这两个区间进行归并排序
        int mid = (left + right)/2;
        mergeSortHelper(array, left, mid);
        mergeSortHelper(array, mid, right);
        merge(array,left,mid,right);

    }
    public static void merge(int[] array,int left,int mid,int right){
        //创建一段临时空间 长度为两个带归并区间的和
        int length = right - left;
        int [] output = new int [length];
        int outputIndex = 0;
        int i = left;
        int j = mid;

        while(i<mid &&j<right){
            if(array[i] <= array[j]){
                output[outputIndex++] = array[i++];
            }else{
                output[outputIndex++] = array[j++];

            }
        }//有一个至少遍历完了
        while(i<mid){
            output [outputIndex++] = array[i++];
        }
        while(j<right){
            output [outputIndex++] = array[j++];
        }
        //最后一步  把原来的元素拷回去
        for (int k = 0;k < length;k++){
            array[left+k] = output [k];
        }
    }

    public static void main(String[] args) {
        int []arr = {9,7,1,4,2,8,6,3,5};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //非递归 归并排序   利用数组下标
    public static void mergeSort1(int[] array) {
        for (int i = 1; i < array.length; i = i * 2) {
            for (int j = 0; j < array.length; j = j + 2 * i) {
                int low = j;
                int mid = j + i;
                if (mid >= array.length) {
                    continue;
                }
                int high = mid + i;
                if (high > array.length) {
                    high = array.length;
                }
                merge(array, low, mid, high);
            }
        }
    }
}
