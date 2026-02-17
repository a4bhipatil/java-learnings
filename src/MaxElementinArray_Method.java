public class MaxElementinArray_Method {
    static int Max(int A[]){
        int max=A[0];
        for(int i=1; i<A.length; i++){
            if(A[i]>max)
                max=A[i];
        }
        return max;
    }
    public static void main(String[] args){
        int A[]={3,5,7,2,9,15,1};
        int max = 0;
        int result=Max(A);
        System.out.println(result);
    }
}
