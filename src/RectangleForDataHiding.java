class rectangletest{
    private double length;
    private double breadth;

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        length=l;
    }
    public void setBreadth(double b){
        breadth=b;
    }

    public double Area(){
        return length*breadth;
    }
    public double parameter(){
        return 2*length+2*breadth;
    }
    public boolean isSquare(){
        if(length==breadth)
            return true;
        else
            return false;
    }
}
public class RectangleForDataHiding {
    public static void main(String[] args){
        rectangletest r1=new rectangletest();

        r1.setLength(7.1);
        r1.setBreadth(7.1);
        System.out.println("Area: "+r1.Area());
        System.out.println("parameter: "+r1.parameter());
        System.out.println("Square: "+r1.isSquare());

        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());
    }
}
