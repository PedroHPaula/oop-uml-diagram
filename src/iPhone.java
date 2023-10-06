import java.util.List;

public class iPhone implements MusicPlayer, PhoneDevice, InternetBrowser{

    private List<String> playlist;

    private String phoneNumber;

    @Override
    public void showPage(String url) {
        System.out.println("Displaying page with address: "+url);
    }

    @Override
    public void addNewTab() {
        System.out.println("Opening a new tab");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing current page");
    }

    @Override
    public void play() {
        System.out.println("Playing current music of the playlist");
    }

    @Override
    public void pause() {
        System.out.println("Pausing current music of the playlist");
    }

    @Override
    public void selectMusic(String name) {
        System.out.println("The music: "+name+" has been selected");
    }

    @Override
    public void call(String number) {
        System.out.println("Calling "+number);
    }

    @Override
    public void answer(String number) {
        System.out.println("Answering "+number);
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Checking the VoiceMail");
    }
}
