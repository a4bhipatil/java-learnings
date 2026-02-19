class circle{
    public double radias;
    public double area(){
        return Math.PI*radias*radias;
    }
    public double parameter(){
        return 2*Math.PI*radias;
    }
    public double circumference(){
        return parameter();
    }
}
public interface Circle1 {
    public static void main(String[] args){
        circle c1=new circle();
        circle c2=new circle();
        c1.radias=7;
        c2.radias=14;
        System.out.println("Area: "+c1.area());
        System.out.println("parameter: "+c1.parameter());
        System.out.println("circumference: "+c1.circumference());

        System.out.println("Area2: "+c2.area());
        System.out.println("parameter2: "+c2.parameter());
        System.out.println("circumference2: "+c2.circumference());
    }
}
