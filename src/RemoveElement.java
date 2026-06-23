import java.util.*;
class  Remove{
    public int removeElement(int[] a,int data){
        int k=0;
        for(int i=0; i<a.length; i++){
            if(a[i]!=data){
                a[k]=a[i];
                System.out.print(a[k]+" ");
                k++;
            }
        }
        return -1;
    }
}
public class RemoveElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int data=sc.nextInt();
        Remove s=new Remove();
        s.removeElement(a,data);
    }
}
