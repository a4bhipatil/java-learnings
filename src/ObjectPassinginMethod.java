public class ObjectPassinginMethod {
    static void update(int X[],int index,int value){
        X[index]=value;
    }
    public static void main(String[] args){
        int A[]={1,2,3,4,5};
        update(A,2,25);
        System.out.println(A[0]);
        for(int x:A)
            System.out.print(x+" ");
    }
}
