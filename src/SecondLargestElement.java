public class SecondLargestElement {
    public static void main(String[] args){
        System.out.println("Find the maximum element in the array");
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int max1=A[0];
        int max2=A[0];
        for(int i=0; i<A.length; i++){
            if(max1<A[i]) {
                max2 = max1;
                max1=A[i];
            }
            else if(max2<A[i])
                max2=A[i];
        }
        System.out.print(max2);

    }
}
