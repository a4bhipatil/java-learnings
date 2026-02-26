abstract class shape{
    abstract double perimeter();
    abstract double area();
}
class Circle extends shape{
    public double radias;
    @Override
    public double perimeter(){
        return 2*Math.PI*radias;
    }
    @Override
    public double area(){
        return Math.PI*radias*radias;
    }
}
class Rectangle2 extends shape{
    public double length;
    public double breadth;
    public double perimeter(){
        return 2*(length+breadth);
    }
    public double area(){
        return length*breadth;
    }
}
public class AbstractClassExample {
    public static void main(String[] args){
        Rectangle2 r=new Rectangle2();
        r.breadth=10;
        r.length=5;
        shape s=r;
        System.out.println(r.area());
    }
}
