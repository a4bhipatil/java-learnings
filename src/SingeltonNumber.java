class Solution{
    static int singlenumber(int[] nums){
        int result=0;
        for(int i=0; i<32; i++){
            int sum=0;
            for(int n:nums){
                if(((n>>i)&1)==1){
                    sum++;
                }
            }
            if(sum%3!=0){
                result|=(1<<i);
            }
        }
        return result;
    }
}
public class SingeltonNumber {
    public static void main(String[] args){
        int num1[]={2,2,3,2};
        Solution n=new Solution();
        System.out.println(n.singlenumber(num1));
    }
}
