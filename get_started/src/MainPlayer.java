public class MainPlayer {
    public static void main(String[] args) {
        playVideo(new Computer());
        playMusic(new Computer());
    }

    public static void playVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void playMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }
}
