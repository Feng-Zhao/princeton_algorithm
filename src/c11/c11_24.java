package c11;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Timer;

public class c11_24 {
    //最大公约数
    public static void main(String[] args){
        StdOut.println("求大公约数：请输入两个整数:");
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        if (a == b){
            StdOut.println("请输入两个不同的数");
            System.exit(-1);
        }

        if (a < b){
            int c = a;
            a = b;
            b = c;
        }

        Euclid(a,b);
        gxjs(a,b);

    }

    public static void Euclid(int a, int b){
        long start = System.currentTimeMillis();
        int r = a % b;
        while (r != 0){
            a = b;
            b = r;
            r = a % b;
        }
        StdOut.println("欧几里得算法（辗转相除）：" + b);
        StdOut.println("时间：" + (System.currentTimeMillis() - start) + " ms");
    }
    public static void gxjs(int a, int b){
        long start = System.currentTimeMillis();
        while(a != b){
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        StdOut.println("更相减损术：" + b);
        StdOut.println("时间：" + (System.currentTimeMillis() - start) + " ms");
    }
}
