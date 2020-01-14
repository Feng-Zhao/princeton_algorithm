package c11;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class c11_11 {
    public static void main(String[] args){
        int row = StdRandom.uniform(1,10);
        int col = StdRandom.uniform(1,10);
        boolean[][] b = new boolean[row][col];

        StdOut.printf("initialize a 2D boolean array: row = %d, col = %d \n",
                row, col);

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                b[i][j] = StdRandom.bernoulli();
            }
        }

        //the first line
        StdOut.printf("\t");
        for (int j = 0; j < col; j++) {
            StdOut.printf("%2d",j+1);
        }
        StdOut.println();

        //the body
        for(int i = 0; i < row; i++) {
            StdOut.printf("%d\t", i+1);
            for (int j = 0; j < col; j++) {
                if(b[i][j]) {
                    StdOut.print(" *");
                }
                else {
                    StdOut.print("  ");
                }
            }
            StdOut.print('\n');
        }
    }
}
