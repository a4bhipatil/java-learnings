import java.util.*;
class Brocode1{
    public void check(int[] x){
        for(int i=0; i<x.length-1; i++){
            for(int j=i+1; j<x.length; j++){
                if(x[i]==x[j]) {
                    System.out.println("True");
                    return;
                }
            }
        }
        System.out.println("False");
    }
}

class CheckingRepeatedNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Brocode1 b=new Brocode1();
        int n=sc.nextInt();
        int[] x=new int[n];
        for(int i=0; i<n; i++){
            x[i]=sc.nextInt();
        }
        b.check(x);
    }
}