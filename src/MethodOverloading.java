public class MethodOverloading {
//    static int max(int x,int y){
//        if(x>y)
//            return x;
//        else
//            return y;
//    }
//    public static void main(String[] args){
//        int a=100;
//        int b=15;
//        int result=max(a,b);
//        System.out.println(result);
//    }


//    static int max(int x,int y,int z){
//        if(x>y && x>z)
//            return x;
//        else if(y>z)
//            return y;
//        else
//            return z;
//    }
//    public static void main(String[] args){
//        int a=10;
//        int b=15;
//        int c=50;
//        int result=max(a,b,c);
//        System.out.println(result);
//    }

    static float max(float x,float y){
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args){
        float a=10.1f;
        float b=15f;
        float result=max(a,b);
        System.out.println(result);
    }
}
