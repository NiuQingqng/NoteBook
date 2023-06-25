package designPattern.proxy;

/**
 * 代理模式测试类
 *
 * @author Niuniu
 * @date 2023/6/1
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
