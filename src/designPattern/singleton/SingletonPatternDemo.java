package designPattern.singleton;

/**
 * Demo
 *
 * @author Niuniu
 * @date 2023/5/25
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.print();
    }
}
