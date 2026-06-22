import java.util.Scanner;

class Increasing{
    public void Sorting(int[] a){
        for(int i=0; i<a.length; i++){
            int mini=i;
            for(int j=i+1; j<a.length; j++){
                if(a[j]<a[mini])
                    mini=j;
            }
            int t=a[i];
            a[i]=a[mini];
            a[mini]=t;
        }
        for(int x:a)
            System.out.print(x+" ");
    }
}
public class SortingElementsIncreasing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        Increasing arr=new Increasing();
        arr.Sorting(a);
    }
}
