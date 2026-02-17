public class ParameterPassingMethod {

    // it is type of integer value passing
//    static int add(int x,int y){
//        int z;
//        z=x+y;
//        return z;
//    }
//    public static void main(String[] args){
//        int a=10,b=15,c;
//        c=add(a,b);
//        System.out.println(c);
//    }

    //now for string passing;
    static void welcome(String n){
        System.out.println("welcome mr/ms "+n);
    }
    public static void main(String[] args){
        String name="Abhilash";
        welcome(name);
    }
}
