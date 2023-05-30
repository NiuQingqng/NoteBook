package designPattern.abstractFactory;

import designPattern.abstractFactory.color.Blue;
import designPattern.abstractFactory.color.Color;
import designPattern.abstractFactory.color.Green;
import designPattern.abstractFactory.color.Red;
import designPattern.abstractFactory.shape.Circle;
import designPattern.abstractFactory.shape.Rectangle;
import designPattern.abstractFactory.shape.Shape;
import designPattern.abstractFactory.shape.Square;

/**
 * 颜色工厂
 *
 * @author Niuniu
 * @date 2023/5/25
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (colorType.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
