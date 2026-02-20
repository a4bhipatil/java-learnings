class rectangle{
    public int length;
    public int breadth;
    public int Area(){
        return length*breadth;
    }
    public int parameter(){
        return 2*length+2*breadth;
    }
    public boolean isSquare(){
        if(length==breadth)
            return true;
        else
            return false;
    }
}
public class Rectangle1 {
    public static void main(String[] args){
        rectangle r1=new rectangle();
        r1.length=7;
        r1.breadth=7;
        System.out.println("Area: "+r1.Area());
        System.out.println("parameter: "+r1.parameter());
        System.out.println("Square: "+r1.isSquare());
    }
}
