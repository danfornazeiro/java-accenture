public class SmartPhone implements MusicPlayer, VideoPlayer {

    @Override
    public void playMusic() {
        System.out.println("Smartphone Playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Smartphone Pausing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Smartphone Stopping music");
    }

    @Override
    public void playVideo() {
        System.out.println("Smartphone Playing video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("SmartphonePausing video");
    }

    @Override
    public void stopVideo() {
        System.out.println("SmartphoneStopping video");
    }
}
