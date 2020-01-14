package c11;

import edu.princeton.cs.algs4.StdOut;

public class c11_19_FibonacciN100 {
    static private int N = 100;
    static private double[] f = new double [N];
    static private int count = 1;
    public static double F(int n){
        if (n <= count){
            return f[n];
        }
        else{
            f[n] = F(n-1) + F(n-2);
            count = n;
            return f[n];
        }
    }

    public static void main(String[] args) {
        f[0] = 0;
        f[1] = 1;
        for(int i = 0; i < N; i++){
            StdOut.println(i + " " + F(i));
        }
    }
}
