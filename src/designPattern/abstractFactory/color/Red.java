package designPattern.abstractFactory.color;

/**
 * 红色
 *
 * @author Niuniu
 * @date 2023/5/25
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("填充红色");
    }
}
