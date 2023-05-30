package designPattern.adapter;

/**
 * 测试类
 * 使用音频播放器播放文件
 * 对于音频播放器不能播放的文件类型交给适配器调用其他播放器播放
 *
 * @author Niuniu
 * @date 2023/5/17
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "test.mp3");
        audioPlayer.play("mp4", "test.mp4");
        audioPlayer.play("vlc", "test.vlc");
        audioPlayer.play("avi", "test.avi");
    }
}
