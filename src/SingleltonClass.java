import javax.swing.*;

class coffeemachine{
    private float waterqty;
    private float milkqty;
    private float cofeeqty;
    private float sugerqty;

    static public coffeemachine m=null;
    private coffeemachine(){
        cofeeqty=1;
        waterqty=1;
        milkqty=1;
        sugerqty=1;
    }
    public void fillwater(float qty){
        waterqty=qty;
    }
    public void fillsugar(float qty){
        sugerqty=qty;
    }
    public float getcofee(){
        return 0.23f;
    }
    static coffeemachine getInstance(){
        if(m==null)
            m=new coffeemachine();
        return m;
    }
}
public class SingleltonClass {
    public static void main(String[] args){
        coffeemachine m1=coffeemachine.getInstance();
        coffeemachine m2=coffeemachine.getInstance();
        coffeemachine m3=coffeemachine.getInstance();

        System.out.println(m1+" "+m2+" "+m3);
        if(m1==m2 && m2==m3)
            System.out.println("Same");
    }
}
