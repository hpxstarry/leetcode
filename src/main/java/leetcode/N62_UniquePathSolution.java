package leetcode;

public class N62_UniquePathSolution {
    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (m > n) {
            return computePermutationNumber(m-1, n-1);
        } else {
            return computePermutationNumber(n-1, m-1);
        }
    }

    private int computePermutationNumber(int m, int n) {
        // (m+n)! / m! / n!
        long permutation = 1;
        for (int i = m + 1;i <= m+n;++i) {
            permutation *= i;
        }
        for (int i = 1;i <= n;++i) {
            permutation /= i;
        }
        return (int)permutation;
    }
}
