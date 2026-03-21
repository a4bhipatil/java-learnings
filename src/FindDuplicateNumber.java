import java.util.ArrayList;
import java.util.List;

class Solution1{
    public static List<Integer> Findduplicates(int[] nums){
        List<Integer> result=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int index=Math.abs(nums[i])-1;

            if(nums[index]<0){
                result.add(index+1);
            }
            else{
                nums[index]=-nums[index];
            }
        }
        return result;
    }
}
public class FindDuplicateNumber {
    public static void main(String[] args){
        int nums[]={4,3,2,7,8,2,3,1};
        List<Integer> duplicate= Solution1.Findduplicates(nums);
        System.out.println(duplicate);
    }
}
