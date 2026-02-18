public class VariableArgument_Method {
//    static void show(int ...A){
//        for(int x:A)
//            System.out.print(x+" ");
//    }
//
//    public static void main(String[] args){
//        show();
//        show(1,3,45,64,4,3);
//        show(new int[]{10,20,30,40,50});
//    }


    static void showList(String ...S){
        for(int i=0; i<S.length; i++)
            System.out.println(i+1+". "+S[i]);
    }
    public static void main(String[] args){
        showList("John","Smith","Ajay","Mark","Suresh");
    }
}
