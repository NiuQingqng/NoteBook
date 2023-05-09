package base.test;

import base.juc.ThreadPoolDemo;

/**
 * 测试类
 *
 * @author Luyu
 * @date 2023/5/8
 */
public class Test {
    public static void main(String[] args) {
        ThreadPoolDemo pool = ThreadPoolDemo.newThreadPoolDemo;
        pool.fixedThreadPoolDemo();
    }
}
