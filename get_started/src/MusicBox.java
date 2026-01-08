public class MusicBox implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("MusicBox Playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("MusicBox Pausing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("MusicBox Stopping music");
    }
}
