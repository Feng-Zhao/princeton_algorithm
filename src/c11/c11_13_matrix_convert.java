package c11;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class c11_13_matrix_convert {
    public static void main(String[] args){
        StdOut.println("please type two positive integers as the row & col:");
        int row = StdIn.readInt();
        int col = StdIn.readInt();
        if (row <= 0 || col <= 0){
            StdOut.println("make sure the row & col are larger than 0");
            System.exit(-1);
        }
        else{
            //initialize the matrix
            int[][] m = new int[row][col];
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    m[i][j] = StdRandom.uniform(10);
                    StdOut.printf("%2d,",m[i][j]);
                }
                StdOut.println();
            }

            StdOut.println("\n");

            int[][]M = new int[col][row];

            for(int i = 0; i < row; i++){
                for(int j = 0; j< col; j++){
                    M[j][i] = m[i][j];
                }
            }

            for(int i = 0; i < col; i++){
                for(int j = 0; j < row; j++){
                    StdOut.printf("%2d,",M[i][j]);
                }
                StdOut.println();
            }
        }
    }
}
