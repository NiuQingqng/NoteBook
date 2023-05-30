package designPattern.abstractFactory.color;

/**
 * 蓝色
 *
 * @author Niuniu
 * @date 2023/5/25
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("填充蓝色");
    }
}
