package designPattern.factory;

/**
 * Demo
 * 使用工厂得到所需实例
 *
 * @author Niuniu
 * @date 2023/5/24
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("circle");
        shape.draw();
    }
}
