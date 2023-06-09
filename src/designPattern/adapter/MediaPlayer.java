package designPattern.adapter;

/**
 * 播放目标接口
 *
 * @author Niuniu
 * @date 2023/5/17
 */
public interface MediaPlayer {
    public void play(String audioType, String fileName);
}
