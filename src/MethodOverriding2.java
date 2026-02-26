class Car{
    public void start(){System.out.println("car started");}
    public void accelerate(){System.out.println("car accelerated");}
    public void changegear(){System.out.println("car gear changed manually");}
}
class LuxaryCar extends Car{
    public void changegear(){System.out.println("Luxary car gear changed auto");}
    public void sunroof(){System.out.println("Luxary car have sunroof");}
}
public class MethodOverriding2 {
    public static void main(String[] args){
//        Car c=new Car();
//        c.start();
//        c.accelerate();
//        c.changegear();

//        LuxaryCar c1=new LuxaryCar();
//        c1.start();
//        c1.accelerate();
//        c1.changegear();
//        c1.sunroof();

        Car c2=new LuxaryCar();
        c2.start();
        c2.accelerate();
        c2.changegear();

    }
}
