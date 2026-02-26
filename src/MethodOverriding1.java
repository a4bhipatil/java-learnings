class TV{
    public void switchon(){System.out.println("TV is switch on");}
    public void changechannel(){System.out.println("TV channel is changed");
    }
}
class SmartTV extends TV{
    public void switchon(){System.out.println("Snart TV is switch on");}
    public void changechannel(){System.out.println("Smart TV channel is changed");}
    public void brows(){System.out.println("Smart TV browsing");}
}
public class MethodOverriding1 {
    public static void main(String[] args){
//        TV t=new TV();
//        t.switchon();
//        t.changechannel();
//        SmartTV t1=new SmartTV();
//        t1.changechannel();
//        t1.switchon();
//        t1.brows();

        TV t1=new SmartTV();
        t1.changechannel();
        t1.switchon();

    }
}
