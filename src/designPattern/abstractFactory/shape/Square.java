package designPattern.abstractFactory.shape;

/**
 * 方形
 *
 * @author Niuniu
 * @date 2023/5/24
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个方形");
    }
}
