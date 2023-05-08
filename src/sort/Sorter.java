package sort;

/**
 * 排序
 *
 * @author niuniu
 * @date 2023/5/6
 */
public interface Sorter {
    // 冒泡排序
    void bubbleSort(int[] arr);

    // 插入排序
    void insertionSort(int[] arr);

    // 选择排序
    void selectionSort(int[] arr);

    // 快速排序
    void quickSort(int[] arr, int left, int right);

    // 归并排序
    void mergeSort(int[] arr, int l, int r);

    // 堆排序
    void heapSort(int[] arr);
}
