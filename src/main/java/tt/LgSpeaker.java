package tt;

public class LgSpeaker implements Speaker{

    @Override
    public void up(){
        System.out.println("LG volume up");
    }

    @Override
    public void down(){
        System.out.println("LG volume down");
    }

}
