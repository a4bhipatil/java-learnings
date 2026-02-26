class Test3{
    static {
        System.out.println("Block 1");
    }
    static {
        System.out.println("Block 2");
    }
}
public class Static1 {
    public static void main(String[] args){
        Test3 t=new Test3();
        System.out.println("Main");
    }

}
