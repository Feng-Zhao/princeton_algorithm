package c11;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class c11_9_int_to_bin_string {
    public static void main(String[] args){
        StdOut.println("please type a positive integer");
        int a = StdIn.readInt();
        if (a < 0){
            StdOut.println("please type a positive integer");
        }
        else{
            String s = "";
            while(a != 0){
                s = (a % 2) + s;
                a = a/2;
            }
            StdOut.println(s);
        }
    }
}
