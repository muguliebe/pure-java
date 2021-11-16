package tt;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

public class What {

    public static void main(String[] args) {

        LgSpeaker speaker = new LgSpeaker();
        Tv tv = new Tv(speaker); // <---- 생성자호출
        tv.on(); // TV 켰다

        tv.volumeUp();
        tv.volumeDown();


        tv.off(); // TV 껐다

    }

}
