import java.util.Arrays;

class Print_first_n_Fibonacci_Numbers {

    public static long fibonacci(long n){
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static long[] printFibb(int n)
    {
        long[] ans = new long[n];
        for(int i=1; i<=n; i++){
            ans[i-1] = fibonacci(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        long[] ans = printFibb(7);
        System.out.println(Arrays.toString(ans));
    }
}
