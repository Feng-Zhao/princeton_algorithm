package c11;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class c11_5 {
    public static void run(){
        StdOut.println("please type two double type number:");
        double a;
        double b;
        a = StdIn.readDouble();
        b = StdIn.readDouble();

        if (a > 0 && a < 1){
            if(b > 0 && b < 1) {
                StdOut.println("true");
            }
        }
        else{
            StdOut.println("false");
        }
    }

    public static void main(String args[]){
        run();
    }
}
