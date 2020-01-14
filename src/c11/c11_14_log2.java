package c11;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class c11_14_log2 {
    public static void main(String args[]){
        StdOut.println("type an integer:");
        int a = StdIn.readInt();
        int result = 0;

        if(a == 0){
            StdOut.println("negative infinity");
        }
        else{
            while (a > 1){
                a /= 2;
                result++;
            }
            StdOut.println(result);
        }
    }
}
