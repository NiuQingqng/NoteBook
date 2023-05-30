package designPattern.adapter;

/**
 * 被适配者实现类
 *
 * @author Niuniu
 * @date 2023/5/17
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
