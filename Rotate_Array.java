//leetcode problem no 159
import java.util.ArrayList;
import java.util.Arrays;

public class Rotate_Array {
    public static void rotate(int[] nums, int k) {
        if(nums.length==1 || k==0){
            return;
        }
        else{
            if(k>nums.length){
                k=k%nums.length;
            }
            int i=0;
            ArrayList<Integer> al_last = new ArrayList<>();
            ArrayList<Integer> al_right = new ArrayList<>();
            for(i=0; i<nums.length-k; i++){
                al_right.add(nums[i]);
            }
            while(i<nums.length){
                al_last.add(nums[i]);
                i++;
            }
            int in=0;
            for(int p=0; p<al_last.size(); p++){
                nums[in] = al_last.get(p);
                in++;
            }
            for(int q=0; q<al_right.size(); q++){
                nums[in] = al_right.get(q);
                in++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        rotate(arr, 2);
    }
}
