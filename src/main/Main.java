package main;

import sort.Sorter;
import sort.impl.SortImpl;

import java.util.Arrays;

/**
 * 测试主类
 *
 * @author niuniu
 * @date 2023/5/4
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {34, 123, 1, 34, 23, 77};
        Sorter sorter = new SortImpl();
        sorter.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
