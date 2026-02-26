class drum{
    private int radias;
    private int hight;
    public drum(){
        radias=1;
        hight=1;
    }
    public drum(int r, int h){
        setRadias(r);
        setHight(h);
    }
    public int getRadias(){
        return radias;
    }
    public int getHight(){
        return hight;
    }
    public void setRadias(int r){
        if(r>=0)
            radias=r;
        else
            radias=0;
    }
    public void setHight(int h){
        if(h>=0)
            hight=h;
        else
            hight=0;
    }
    public double lidarea(){
        return Math.PI*radias*radias;
    }
    public double totalsurfacearea(){
        return 2*Math.PI*radias*(radias+hight);
    }
    public double circumference(){
        return 2*Math.PI*radias;
    }
    public double volume(){
        return Math.PI*radias*radias*hight;
    }
}
public class CunstructerFor_Cylinder {
    public static void main(String[] args){
        drum cy=new drum(2,3);
        System.out.println(cy.lidarea());
        System.out.println(cy.totalsurfacearea());
        System.out.println(cy.circumference());
        System.out.println(cy.volume());
    }
}
