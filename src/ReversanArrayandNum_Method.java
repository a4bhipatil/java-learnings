public class ReversanArray_Method {
    static int Revers(int A[]){
        for(int i=A.length-1; i>=0; i--)
            for(int j=0; j<B.length; j++)
                B[j]=A[i];
        return 0;
    }
    public static void main(String[] args){
        int A[]={2,4,64,6,42,8,9,5};
        int B[];
        int result=Revers(A);
        for(int x:B)
            System.out.println(x);
    }
}
