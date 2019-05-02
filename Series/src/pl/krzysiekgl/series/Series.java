package pl.krzysiekgl.series;

public class Series {
    public static int nSum(int n) {
        int sum = 0;
        for(int i = 0; i<=n; ++i) sum+=i;
        return sum;
    }
    
    public static int factorial(int n) {
        if(n == 0) return 0;
        
        int product = 1;
        for(int i = n; i>0; --i) product*=i;
        return product;
    }
    
    public static int fibonacci(int n) {
        if(n == 0) return 0;
        else if(n == 1) return 1;
        return (fibonacci(n-2) + fibonacci(n-1));
    }
}
