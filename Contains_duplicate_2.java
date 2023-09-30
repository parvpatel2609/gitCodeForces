import java.util.HashMap;

public class Contains_duplicate_2 {
    public static void main(String[] args) {
        boolean flag = containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1);
        System.out.println(flag);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<=k; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i], i);      //index is store in hashmap
            }
            else{
//                System.out.println(hm.get(nums[i]));
//                System.out.println(hm.get(nums[i]) - i);
                int dif = hm.get(nums[i])-i;
                if(dif>k){
                    hm.remove(nums[i]);
                    hm.put(nums[i], i);
                    continue;
                }

                if(Math.abs(hm.get(nums[i])-i)<=k){
                    return true;
                }
            }
        }
        return false;
    }
}
