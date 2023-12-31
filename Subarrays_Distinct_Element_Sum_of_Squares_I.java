import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Subarrays_Distinct_Element_Sum_of_Squares_I {
    public static ArrayList<ArrayList<Integer>> findSubarrays(List<Integer> arr) {
        int n = arr.size();
        ArrayList<ArrayList<Integer>> subarrays = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                ArrayList<Integer> subarray = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    subarray.add(arr.get(k));
                }
                subarrays.add(subarray);
            }
        }

        return subarrays;
    }

    public static int sumCounts(List<Integer> nums) {
        ArrayList<ArrayList<Integer>> subarrays = findSubarrays(nums);
        ArrayList<Integer> ans = new ArrayList<>();
//        System.out.println(subarrays);
        for(int i=0; i<subarrays.size(); i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int k=0; k<subarrays.get(i).size(); k++){
                if(!hs.contains(subarrays.get(i).get(k))){
                    hs.add(subarrays.get(i).get(k));
                }
            }
            ans.add(hs.size());
        }
//        System.out.println(ans);
        int val = 0;
        for(int i=0; i<ans.size(); i++){
            val += Math.pow(ans.get(i),2);
        }
        return val;
    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);al.add(2);al.add(1);
        int ans = sumCounts(al);
        System.out.println(ans);
    }
}
