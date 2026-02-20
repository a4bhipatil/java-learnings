class cylinder{
    public int radias;
    public int height;
    double Lidarea(){
        return Math.PI*radias*radias;
    }
    double TotalSurfaceArea(){
        return 2*Math.PI*radias*(radias+height);
    }
    double volume() {
        return Math.PI * radias * radias * height;
    }
}
public class Cylinder {
    public static void main(String[] args){
        cylinder c1=new cylinder();
        c1.radias=3;
        c1.height=9;
        System.out.println(c1.Lidarea());
        System.out.println(c1.TotalSurfaceArea());
        System.out.println(c1.volume());
    }
}
