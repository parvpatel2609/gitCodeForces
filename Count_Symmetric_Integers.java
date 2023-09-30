//this is leetcode contest code of 3rd september
public class Count_Symmetric_Integers {
    public static boolean isSymmetric(int n) {
        int digitCount = (int) Math.log10(n) + 1;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < digitCount / 2; i++) {
            sum1 += n % 10;
            n /= 10;
        }
        for (int i=digitCount / 2; i<digitCount; i++){
            sum2 += n % 10;
            n /= 10;
        }
        if(sum1 == 0 && sum2 == 0)
            return false;
        else if (sum1 == sum2)
            return true;
        return false;
    }

    public static int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        int ans = countSymmetricIntegers(1 , 100);
        System.out.println(ans);
    }
}
