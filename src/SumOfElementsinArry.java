public class SumOfElementsinArry {
    public static void main(String[] args){
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int sum=0;
        for(int i=0; i<A.length; i++){
            sum=sum+A[i];
        }
        System.out.print(sum);

        for(int x:A){
            sum=sum+x;
        }
        System.out.print(sum);
    }
}
