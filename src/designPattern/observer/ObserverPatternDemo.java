package designPattern.observer;

/**
 * 测试类
 * 多个观察者实例化时去目标对象里注册
 * 目标对象发生改变时通知观察者
 *
 * @author Niuniu
 * @date 2023/5/24
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
