package designPattern.adapter;

/**
 * 被适配者接口
 *
 * @author Luyu
 * @date 2023/5/17
 */
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
