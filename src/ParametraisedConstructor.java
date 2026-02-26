//class Parent{
//    Parent(){
//        System.out.println("non peram of parent");
//    }
//    Parent(int x){
//        System.out.println("param of parent");
//    }
//}
//class Child extends Parent{
//    Child(){
//        System.out.println("non param of child");
//    }
//    Child(int y){
//        System.out.println("param of child");
//    }
//    Child(int x,int y){
//        super(x);
//        System.out.println("2 param of child");
//    }
//}


class Rectangle{
    public int length;
    public int breadth;
    Rectangle(){
        length=breadth=1;
    }
    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
}
class Cuboid1 extends Rectangle{
    public int height;
    Cuboid1(){
        height=1;
    }
    Cuboid1(int h){
        height=h;
    }
    Cuboid1(int l,int b, int h){
        super(l,b);
        height=h;
    }
    int volume(){
        return length*breadth*height;
    }
}
public class ParametraisedConstructor {
    public static void main(String[] args){
//        Child p=new Child(20,10);
        Cuboid1 c=new Cuboid1(3,5,10);
        System.out.println(c.volume());
    }
}




