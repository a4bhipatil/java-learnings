public class SumofAllElementsUsingVarargs_Method {
    static int Sum(int ...A){
        if(A.length==0) return Integer.MIN_VALUE;
        int S=0;
        for(int i=0; i<A.length; i++) {
            S = S + A[i];
        }
        return S;
    }
    public static void main(String[] args){
        System.out.println(Sum(10,20,30,40,50));
    }
}
