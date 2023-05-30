package designPattern.abstractFactory.shape;

/**
 * 圆形
 *
 * @author Niuniu
 * @date 2023/5/24
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }
}
