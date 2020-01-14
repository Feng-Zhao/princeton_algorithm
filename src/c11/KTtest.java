package c11;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class KTtest {
    public static void run(){
        String q = "lended";
        String []t ={"addendum","blenders","commodity","deaden","end","leader","leant",
                "lent","lemonade","pleading"} ;

        StdOut.println("NW");
        for (String target:t) {
            StdOut.println(NW(q,target));
        }

        StdOut.println("\nSW");
        for (String target:t) {
            StdOut.println(SW(q,target));
        }

    }

    private static int NW(String q,String t) {
        int lq = q.length();
        int lt = t.length();
        int [][]F = new int[lq+1][lt+1];
        for (int i = 0; i <= lq; i++) F[i][0] = -i;
        for (int j = 0; j <= lt; j++) F[0][j] = -j;
        for (int i = 1; i <= lq; i++) {
            for (int j = 1; j <= lt; j++) {
                F[i][j] = Math.max(
                        Math.max(F[i - 1][j] - 1, // insertion
                                F[i][j - 1] - 1), //deletion
                        F[i - 1][j - 1] + ((q.charAt(i - 1) == t.charAt(j -
                                1))? 1 : -1));
            }
        }
        return F[lq][lt];
    }

    private static int SW(String q,String t) {
        int lq = q.length();
        int lt = t.length();
        int [][]F = new int[lq+1][lt+1];
        for (int i = 0; i <= lq; i++) F[i][0] = 0;
        for (int j = 0; j <= lt; j++) F[0][j] = 0;
        for (int i = 1; i <= lq; i++) {
            for (int j = 1; j <= lt; j++) {
                F[i][j] = Math.max(
                        Math.max(0, Math.max(F[i - 1][j] - 1, // insertion
                                F[i][j - 1] - 1)), //deletion
                        F[i - 1][j - 1] + ((q.charAt(i - 1) == t.charAt(j - 1))
                                ? 1 : -1));
            }
        }
        return F[lq][lt];
    }

    public static void main(String args[]){
        run();
    }
}
