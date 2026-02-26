class phone{
    public void call(){System.out.println("phone call");}
    public void sms(){System.out.println("phone will sending sms");}
}
interface ICamara{
    void click();
    void record();
}
interface IMusicplayer{
    void play();
    void stop();
}
class Smartphone extends phone implements ICamara,IMusicplayer{
    public void call(){System.out.println("Smart phone calling");}
    public void sms(){System.out.println("Smart phone sending sms");}
    public void click(){System.out.println("Smart phone clicking  the photos");}
    public void record(){System.out.println("Smart phone recording the video");}
    public void play(){System.out.println("Smart phone play the music");}
    public void stop(){System.out.println("Smart phone stop the music");}
}
public class InterfaceExample {
    public static void main(String[] args){
        Smartphone sp=new Smartphone();
        sp.call();
        sp.sms();
        sp.play();
    }
}
