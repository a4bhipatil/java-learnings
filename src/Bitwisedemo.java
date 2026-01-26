public class Bitwisedemo {
    public static void main(String[] args){
        int x=0b1010;//binary form of 10
        int y=0b0110;//binary form of 6
        int a=x&y;
        int b=x|y;
        int c=x^y;
        int d=~x;
        int e=x>>1;
        int f=x<<1;
        int g=x>>>1;
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g);
    }
}
