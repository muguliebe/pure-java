package tt;

public class BoseSpeaker implements Speaker{
    @Override
    public void up(){
        System.out.println("bose volume up");
    }

    @Override
    public void down(){
        System.out.println("bose volume down");
    }
}
