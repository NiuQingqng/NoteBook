package designPattern.abstractFactory.shape;

/**
 * 矩形
 *
 * @author Niuniu
 * @date 2023/5/24
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
