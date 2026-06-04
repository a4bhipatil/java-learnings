import java.util.*;
public class CheckDuplicateNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int z=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a[i]==a[j]){
                    z++;
                }
            }
        }
        if(z>n){
            System.out.println("duplicate number are found");
        }
        else {
            System.out.println("duplicate numbers are not found");
        }
    }
}