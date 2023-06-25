package designPattern.proxy;

/**
 * 真实图片类
 *
 * @author Luyu
 * @date 2023/6/1
 */
public class RealImage implements Image {

    private String fileName;

    RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("load file from disk: "  + fileName);
    }

    @Override
    public void display() {
        System.out.println("displaying: " + fileName);
    }
}
