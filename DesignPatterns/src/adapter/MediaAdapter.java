package adapter;

public class MediaAdapter implements MediaPlayer{

    VLCPlayer vlcPlayer;

    public MediaAdapter(){
        vlcPlayer = new VLCPlayer();
    }

    @Override
    public void play(String data) {
            String convertedData = convertToVLC(data);
            vlcPlayer.reproduce(convertedData);
        }

    private String convertToVLC(String name){
        //riformatta mp3 in vlc
        name = name.replaceAll("mp3", "vlc");
        return name;
    }
}
