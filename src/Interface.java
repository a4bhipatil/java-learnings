interface Test{
    void math1();
    void math2();
}
class Test1 implements Test {
    @Override
    public void math1(){
        System.out.println("math1");
    }
    @Override
    public void math2(){
        System.out.println("math2");
    }
    public void math3(){
        System.out.println("math3");
    }
}
public class Interface {
    public static void main(String[] args){
        Test t=new Test1();
        t.math1();

    }
}
