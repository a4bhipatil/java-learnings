import java.util.Scanner;

public class SearchingElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A[]={3,9,7,8,12,6,15,5,4,10};
        System.out.println("Search an element in array");
        int key= sc.nextInt();
        for(int i=0; i<A.length; i++){
            if(A[i]==key) {
                System.out.println("Elements found at index: "+i);
                System.exit(0);
            }
        }
        System.out.print("not found in an array");
    }
}
