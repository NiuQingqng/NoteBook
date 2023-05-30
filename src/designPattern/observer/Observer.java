package designPattern.observer;

/**
 * 观察者接口
 *
 * @author Niuniu
 * @date 2023/5/24
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
