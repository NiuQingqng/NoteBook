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
        int a;
        try{
            a = 1/0;
        }catch (Exception e){
            throw new RuntimeException("aa/0");
        }
        System.out.println(a);
    }
}
