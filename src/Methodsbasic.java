public class Methodsbasic {
//    int max(int x , int y){
//        if(x>y)
//            return x;
//        else
//            return y;
//    }
//    public static void main(String[] args){
//        int a=10 , b=15,c;
//        Methodsbasic ms=new Methodsbasic();
//        System.out.println(ms.max(a,b));
//
//    }


    static void inc(int x){
        x++;
        System.out.println(x);
    }
    public static void main(String[] args){
        int a=10,b=15;
        inc(a);
        System.out.println(a);
    }
}
