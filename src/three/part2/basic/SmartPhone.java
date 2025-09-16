package three.part2.basic;

public class SmartPhone implements Phone, Camera, MusicPlayer {

    @Override
    public void call(String number) {
        System.out.println("正在撥打電話給: " + number);
    }

    @Override
    public void takePicture() {
        System.out.println("拍照中...已經存到相簿");
    }

    @Override
    public void playMusic(String songName) {
        System.out.println("正在播放音樂: " + songName);
    }
}
