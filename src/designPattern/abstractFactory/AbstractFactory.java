package designPattern.abstractFactory;

import designPattern.abstractFactory.color.Color;
import designPattern.abstractFactory.shape.Shape;

/**
 * 抽象工厂
 *
 * @author Niuniu
 * @date 2023/5/25
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
