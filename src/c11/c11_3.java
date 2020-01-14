package c11;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//practice
public class c11_3 {
    public static void run(){
        StdOut.println("please type three integer(betweem -2^31 to 2^31 -1): ");
        int a;
        int b;
        int c;
        a = StdIn.readInt();
        b = StdIn.readInt();
        c = StdIn.readInt();

        if (a == b && b == c){
            StdOut.println("true");
        }
        else{
            StdOut.println("false");
        }
    }

    public static void main(String args[]){
        run();
    }
}
