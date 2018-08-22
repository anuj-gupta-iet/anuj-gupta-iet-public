package adapter;

public class AdapterPatternDemo {
	public static void main(String[] args) {

		MediaPlayer mediaPlayer = new AudioPlayer();

		mediaPlayer.play("mp3", "beyond the horizon.mp3");
		// Playing mp3 file. Name: beyond the horizon.mp3

		mediaPlayer.play("vlc", "far far away.vlc");
		// Playing vlc file. Name: far far away.vlc

		mediaPlayer.play("mp4", "alone.mp4");
		// Playing mp4 file. Name: alone.mp4

		mediaPlayer.play("avi", "mind me.avi");
		// Invalid media. avi format not supported
	}
}
