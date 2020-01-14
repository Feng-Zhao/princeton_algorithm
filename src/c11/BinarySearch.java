package c11;
import java.util.Arrays;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {

    public static int rank(int key, int[] a)
    {//the array must be sorted
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi){
            //here is a bug in :int mid = (lo + hi) / 2;
            //-> lo + hi may overflow
            //the bug free version,below, or mid = lo + (hi-lo)/2;
            int mid = lo + ((hi-lo) >>> 1);
            if(key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1; // there is no key in our array
    }

    //given an array a[], read some ints from stdin,
    //if the int is in the array, print it
    //otherwise, print a tip.
    public static void main(String[] args){
        int[] array = new In(args[0]).readAllInts();
        Arrays.sort(array);
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if (rank(key, array) == -1){
                //StdOut.println("key->" + key + " is not in the array");
                StdOut.print(key);
            }
//            else
//                StdOut.println(key);
        }

    }

}
