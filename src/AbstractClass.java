abstract class Super2{
    public Super2(){System.out.println("super constructor");}
    public void math1(){
        System.out.println("super math1");
    }
    abstract public void math2();
}
class Sub2 extends Super2{
    public void math2(){
        System.out.println("sub math2");
    }
}
public class AbstractClass {
    public static void main(String[] args){
        Super2 s=new Sub2();
        s.math1();
        s.math1();
    }
}
