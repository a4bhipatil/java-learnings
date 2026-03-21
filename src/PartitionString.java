import java.util.ArrayList;
import java.util.List;

class Solution2{
    static List<Integer> partition(String s){
        List<Integer> result=new ArrayList<>();
        int[] last=new int[26];
        for(int i=0; i<s.length(); i++){
            last[s.charAt(i)-'a']=i;
        }
        int start=0;
        int end=0;
        for(int i=0; i<s.length(); i++){
            end=Math.max(end,last[s.charAt(i)-'a']);

            if(i==end){
                result.add(end-start+1);
                start=i+1;
            }
        }
        return result;
    }
}
public class PartitionString {
    public static void main(String[] args){
        String s="ababcbacadefegdehijhklij";
        List<Integer> p=Solution2.partition(s);
        System.out.println(p);
    }
}
