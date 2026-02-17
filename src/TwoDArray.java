public class TwoDArray {
    public static void main(String[] args){
        int A[][]=new int[3][4];
        A= new int[][]{{3, 9, 7, 8}, {12, 6, 15, 5}, {4, 10, 5, 6}};
//        for(int i=0; i<A.length; i++){
//            for(int j=0; j<A[0].length; j++){
//                System.out.format("%02d ",A[i][j]);
//            }
//            System.out.println("");
//        }

        for(int x[]:A){
            for(int y:x){
                System.out.format("%02d ",y);
            }
            System.out.print("\n");
        }
    }
}
