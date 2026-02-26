class Super1{
    public void math1(){System.out.println("super math1");}
    public void math2(){System.out.println("super math2");}
}
class Sub1 extends Super1{
    public void math2(){System.out.println("sub math2");}
    public void math3(){System.out.println("sub math3");}
}
public class DynamicMethodDispatch {
    public static void main(String[] args){
//        Super1 s=new Super1();
//        s.math1();
//        s.math2();

//        Sub1 s=new Sub1();
//        s.math1();
//        s.math2();
//        s.math3();

        Super1 s=new Sub1();
        s.math1();
        s.math2();
    }
}
