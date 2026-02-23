class Super{
    public void display(){
        System.out.println("hello");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("hell,welcome");
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        //Method overriding
//        Super su=new Super();
//        su.display();
//        Sub sb=new Sub();
//        sb.display();

        //Dynamic class dispatch
        Super s=new Sub();
        s.display();

    }
}
