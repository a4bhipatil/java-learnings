abstract class KFC{
    KFC(){
        System.out.println("rules of kfc");
    }
    public void makeitem(){
        System.out.println("Making an item");
    }
    abstract void billing();
    abstract void offer();
}
class Mykfc extends KFC{
    Mykfc(){
        System.out.println("Mykfc");
    }
    void billing(){
        System.out.println("billing");
    }
    void offer(){
        System.out.println("offers");
    }
    void festivaloffer(){
        System.out.println("festival offer");
    }
}
public class AbstractClass2 {
    public static void main(String[] args){

    }
}
