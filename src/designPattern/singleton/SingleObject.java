package designPattern.singleton;

/**
 * 单例对象
 *
 * @author Niuniu
 * @date 2023/5/25
 */
public class SingleObject {
    private static final SingleObject instance = new SingleObject();

    private SingleObject() {

    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("单例对象打印");
    }
}
