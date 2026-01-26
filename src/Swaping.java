public class Swaping {
    public static void main(String[] args){
        int a=9;
        int b=12;
        System.out.println("before swaping A: "+a+" and B: "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swaping A: "+a+" and B: "+b);
    }
}
