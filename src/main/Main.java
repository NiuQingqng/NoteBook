package main;

import java.util.function.Function;

/**
 * 测试主类
 *
 * @author niuniu
 * @date 2023/5/4
 */
public class Main {
    public static void main(String[] args) {
       add(1, 1, System.out::println);
    }

    interface ResponseCallback{
        void processResponse(int c);
    }

    public static void add(int a, int b, ResponseCallback f) {
        int c = a + b;
        f.processResponse(c);
    }
}
