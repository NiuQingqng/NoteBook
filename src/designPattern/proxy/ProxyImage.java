package designPattern.proxy;

/**
 * 代理图片类
 *
 * @author Niuniu
 * @date 2023/6/1
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        // 收代理费
        System.out.println("收代理费！");
        realImage.display();
        // 代理对象动作，记录下查看图片日志
        System.out.println("查看了图片！");
    }
}
