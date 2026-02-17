import java.util.Scanner;

public class PatternsNestedLoop1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1; i<n; i++){
//            for(int j=1; j<i; j++){
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }


//        int n=sc.nextInt();
//        int count=0;
//        for(int i=1; i<n; i++){
//            for(int j=1; j<i; j++){
//                System.out.print(++count+" ");
//            }
//            System.out.println("");
//        }


//        int n=sc.nextInt();
//        for(int i=1; i<n; i++){
//            for(int j=1; j<n-i+1; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println("");
//        }

        int n=sc.nextInt();
        int count=0;
        for(int i=1; i<n; i++){
            for(int j=1; j<n-i+1; j++){
                System.out.format("%02d",++count);
            }
            System.out.println("");
        }
    }
}
