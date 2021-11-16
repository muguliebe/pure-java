package tt;

public class SamsungSpeaker implements Speaker{

    @Override
    public void up(){
        System.out.println("samsung volume up");
    }

    @Override
    public void down(){
        System.out.println("samsung volume down");
    }
}
