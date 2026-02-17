public class Multiplying2Matrices {
    public static void main(String[] args){
        int A[][]=new int[3][3];
        A= new int[][]{{3,5,9}, {7,6,2}, {4,3,5}};
        int B[][]=new int[3][3];
        B= new int[][]{{1,0,0}, {0,1,0}, {0,0,1}};
        int c[][]=new int[3][3];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A.length; j++){
                c[i][j]=0;
                for(int k=0; k<A.length; k++){
                    c[i][j]+=A[i][k]*B[k][j];
                }
            }
        }

        for(int x[]:c){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
