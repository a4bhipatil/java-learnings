public class IncreasingSizeofArry {
    public static void main(String[] args){
        int A[]={3,9,7,8,12};
        int B[]=new int[2*A.length];
        for(int i=0; i<A.length; i++)
            B[i]=A[i];
        A=B;
        for(int x:A)
            System.out.print(x+" ");
        System.out.println("");
        System.out.print(A.length);
    }
}
