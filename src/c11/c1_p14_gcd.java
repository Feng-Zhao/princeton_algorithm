package c11;

public class c1_p14_gcd {
    //欧几里得算法，gcd
    public int gcd(int p, int q) {
        if (q == 0) {
            return p;
        } else {
            int r = p % q;
            return gcd(q, r);
        }
    }
}
