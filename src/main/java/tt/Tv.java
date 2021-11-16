package tt;

public class Tv {

    Speaker speaker;

    Tv(Speaker speaker){
       this.speaker = speaker;
    }

    public void on(){
        System.out.println("TV On");
    }

    public void off(){
        System.out.println("TV Off");
    }

    public void volumeUp() {
        speaker.up();
    }

    public void volumeDown() {
        speaker.down();
    }
}
