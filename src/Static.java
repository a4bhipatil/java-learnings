class Test2{
    static int x=10;
    int y=20;
    void show(){
        System.out.println(x+" "+y);
    }
    static void display(){
        System.out.println(x);
    }
}
public class Static {
    public static void main(String[] args){
        Test2 t1=new Test2();
        t1.show();
        t1.x=100;
        t1.y=50;
        Test2 t2=new Test2();
        t2.show();
        t2.display();
    }
}
