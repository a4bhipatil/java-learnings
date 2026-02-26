class Outer{
    int x=10;
    class Inner{
        int y=20;
        void innerdisplay(){
            System.out.println(x+" "+y);
        }
    }
    public void outerdisply(){
        Inner i=new Inner();
        i.innerdisplay();
        System.out.println(i.y);
    }
}
public class NestedInnerClass {
    public static void main(String[] args){
        Outer.Inner oi=new Outer().new Inner();
        oi.innerdisplay();
    }
}
