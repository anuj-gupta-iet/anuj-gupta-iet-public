package adapter;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer = new VlcPlayer();
			advancedMediaPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new Mp4Player();
			advancedMediaPlayer.playMp4(fileName);
		}
	}
}
