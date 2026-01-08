public class Computer implements MusicPlayer, VideoPlayer {
    @Override
    public void playMusic() {
        System.out.println("Computer Playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Computer Pausing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Computer Stopping music");
    }

    @Override
    public void playVideo() {
        System.out.println("Computer Playing video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Computer Pausing video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Computer Stopping video");
    }
}
