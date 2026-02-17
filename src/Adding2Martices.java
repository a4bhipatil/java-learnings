public class Adding2Martices {
    public static void main(String[] args){
        int A[][]=new int[4][4];
        A= new int[][]{{3, 9, 7, 8}, {12, 6, 15, 5}, {4, 10, 5, 6},{1,2,3,4}};
        int B[][]=new int[4][4];
        B= new int[][]{{3, 9, 7, 8}, {12, 6, 15, 5}, {4, 10, 5, 6},{1,2,3,4}};
        int c[][]=new int[4][4];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A.length; j++){
                c[i][j]=A[i][j]+B[i][j];
            }
        }
        for(int x[]:c){
            for (int y:x){
                System.out.format("%02d ",y);
            }
            System.out.println("");
        }
    }
}
