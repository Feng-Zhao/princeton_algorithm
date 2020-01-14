package c11;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class c11_20_lnN1 {
    public static void main(String[] args){
        StdOut.println("ln(N!): type N = ");
        int N = StdIn.readInt();

        double Na = 1;
        for(int i = 1; i <= N; i++){
            Na *= i;
        }

        StdOut.println("L ln(N!) J = " + ln(Na));
    }

    public static double ln(double n){
        if (n < Math.E){
            return 0;
        }
        else{
            return 1 + ln(n/Math.E);
        }
    }
}
