package c11;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c11_31 {
    public static void main(String args[]){
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.setPenRadius(0.01);
        StdDraw.circle(0.5,0.5,0.5);
        StdOut.println("输入整数N，小数p(0-1):");
        int N = StdIn.readInt();
        double p = StdIn.readDouble();
        List<double[]> points = new ArrayList<>();
        double angle = 2*Math.PI/N;
        StdDraw.setPenRadius(0.02);
        StdDraw.setPenColor(StdDraw.BLACK);
        for (int i = 0; i < N; i++) {
            double theta = i * angle;
            double x = 0.5 + Math.cos(theta) * 0.5;
            double y = 0.5 + Math.sin(theta) * 0.5;
            System.out.println(theta);
            System.out.println(Math.cos(theta));
            System.out.println(Math.sin(theta));
            double[] point = {x,y};
            points.add(point);
            StdDraw.point(x,y);
        }
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.RED);
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                double a = StdRandom.uniform();
                if(a < p);
                StdDraw.line(points.get(i)[0],points.get(i)[1],
                        points.get(j)[0],points.get(j)[1]);
            }
        }
    }

}
