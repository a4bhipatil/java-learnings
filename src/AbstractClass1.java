abstract class Hospital{
    abstract void emergency();
    abstract void appointment();
    abstract void admit();
    abstract void billing();
}
class Myhospital extends Hospital{
    public Myhospital(){
        System.out.println("Vasista hospital");
    }
    public void emergency(){
        System.out.println("emergency");
    }
    public void appointment(){
        System.out.println("appointment");
    }
    public void admit(){
        System.out.println("admit");
    }
    public void billing(){
        System.out.println("billing");
    }
}
public class AbstractClass1 {
    public static void main(String[] args){

    }
}
