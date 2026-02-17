public class DeletinganElement {
    public static void main(String[] args){
        int A[]={3,9,7,8,12,6,15,5,4,10};
        for(int i=0; i<A.length; i++)
            System.out.print(A[i]+" ");
        System.out.println("");
        int index=3;
        for(int i=index; i<A.length-1; i++){
            A[i]=A[i+1];
        }
        for(int i=0; i<A.length-1; i++)
            System.out.print(A[i]+" ");
        System.out.println("");
    }
}
