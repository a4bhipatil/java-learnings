import java.util.Scanner;

public class PatternsNestedLoop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println("");
//        }

//        int n=sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print(i+j+" ");
//            }
//            System.out.println("");
//        }

        int n=sc.nextInt();
        int count=0;
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.format("%02d ",++count);
            }
            System.out.println("");
        }
    }
}
