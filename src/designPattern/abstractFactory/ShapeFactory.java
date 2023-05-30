package designPattern.abstractFactory;

import designPattern.abstractFactory.color.Color;
import designPattern.abstractFactory.shape.Circle;
import designPattern.abstractFactory.shape.Rectangle;
import designPattern.abstractFactory.shape.Shape;
import designPattern.abstractFactory.shape.Square;

/**
 * 图形工厂
 *
 * @author Niuniu
 * @date 2023/5/24
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

}
