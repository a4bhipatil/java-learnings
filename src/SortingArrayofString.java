public class SortingArrayofString {
    public static void main(String[] args){
        String arr[] ={"java","python","ada","basic","pascal","smalltalk"};
        java.util.Arrays.sort(arr);
        for(String x:arr){
            System.out.println(x);
        }
    }
}
