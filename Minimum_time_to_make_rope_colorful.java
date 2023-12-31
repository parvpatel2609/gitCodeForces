//leetcode problem no 1578
public class Minimum_time_to_make_rope_colorful {
    public static int minCost(String colors, int[] arr) {
        int totalTime = 0;
        int i = 0, j = 0;

        while (i < arr.length && j < arr.length) {
            int currTotal = 0, currMax = 0;

            while (j < arr.length && colors.charAt(i) == colors.charAt(j)) {
                currTotal += arr[j];
                currMax = Math.max(currMax, arr[j]);
                j++;
            }

            totalTime += currTotal - currMax;
            i = j;
        }
        return totalTime;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int ans = minCost("abc",arr);
        System.out.println(ans);
    }
}
