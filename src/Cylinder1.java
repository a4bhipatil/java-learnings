class cylinder{
    public int radias;
    public int height;
    double Lidarea(){
        return Math.PI*radias*radias;
    }
    double TotalSurfaceArea(){
        return 2*Math.PI*radias*(radias+height);
    }
    double circumference(){
        return 2*Math.PI*radias;
    }
    double volume() {
        return Math.PI * radias * radias * height;
    }
}
public class Cylinder1 {
    public static void main(String[] args){
        cylinder c1=new cylinder();
        c1.radias=3;
        c1.height=9;
        System.out.printf("Lid Area=%.2f\n ",c1.Lidarea());
        System.out.printf("Total Surface Area of Cylinder=%.2f\n ",c1.TotalSurfaceArea());
        System.out.printf("circumference=%.2f\n ",c1.circumference());
        System.out.printf("Volume=%.2f\n ",c1.volume());
    }
}
