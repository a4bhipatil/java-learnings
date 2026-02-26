class Circle2{
    public double radias;
    public double area(){
        return Math.PI*radias*radias;
    }
    public double parimeter(){
        return 2*Math.PI*radias;
    }
    public double circumference(){
        return parimeter();
    }
}
class Cylinder2 extends Circle2{
    public double height;
    public double volume(){
        return area()*height;
    }
}
public class InheritenceForCircle {
    public static void main(String[] args){
        Cylinder2 c=new Cylinder2();
        c.radias=7;
        c.height=10;
        System.out.println(c.volume());
        System.out.println(c.area());
    }
}
