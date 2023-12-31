import java.util.*;

public class Majority_element_2 {
    public static List<Integer> majorityElement(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        ArrayList<Integer> hash = new ArrayList<>(hs);
        List<Integer> al = new ArrayList<>();
        int digit = nums.length/3;
        if(digit == 0){
            al.addAll(hash);
            return al;
        }
        for(int i=0; i< hash.size(); i++){
            int count = 0;
            for(int j=0; j< nums.length; j++){
                if(nums[j] == hash.get(i))
                    count++;
            }
            if(count>digit)
                al.add(hash.get(i));
        }
        return al;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        List<Integer> ans = majorityElement(nums);
        System.out.println("ans : "+ans);
    }
}
