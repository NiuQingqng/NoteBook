package designPattern.adapter;

/**
 * 测试类
 *
 * @author Luyu
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
