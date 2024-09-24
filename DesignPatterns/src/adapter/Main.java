package adapter;

public class Main {
    public static void main(String[] args) {

        String fileMp3 = "filemp.mp3";
        String fileVlc = "filevl.vlc";

        MediaPlayer mediaPlayer = new MediaAdapter();
        mediaPlayer.play(fileMp3);
        mediaPlayer.play(fileVlc);
    }
}
