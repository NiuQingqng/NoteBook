package designPattern.adapter;

/**
 * 被适配者实现类
 *
 * @author Luyu
 * @date 2023/5/17
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
