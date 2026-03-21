import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int uni=0;
        for(int i=0; i<n; i++){
            uni=uni^sc.nextInt();
        }
        System.out.println(uni);
        sc.close();
    }
}
