//Anonymous Inner class
//abstract class My{
interface My{
    public void show();
}
class Outer2{
    public void display(){
        My m= new My() {
            public void show() {
                System.out.println("hello");
            }
        };
        m.show();
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args){
        Outer1 o=new Outer1();
        o.display();
    }
}
