package designPattern.abstractFactory.color;

/**
 * 绿色
 *
 * @author Niuniu
 * @date 2023/5/25
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("填充绿色");
    }
}
