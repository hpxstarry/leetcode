package leetcode;

import java.util.LinkedList;
import java.util.List;

public class N60_PermutationSolution {

    public String getPermutation(int n, int k) {
        if (n == 0) {
            return "";
        }

        int[] factorials = computeFactorials(n);
        int[] decomposition = decomposeK(n, k, factorials);
        return translateDecompositionToPermutation(n, decomposition);
    }

    private String translateDecompositionToPermutation(int n, int[] decomposition) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> availableNumbers = new LinkedList<>();
        for(int i = 1;i <= n;++i ) {availableNumbers.add(i); }
        for (int i = 0;i < decomposition.length;++i) {
            int numAtI = availableNumbers.remove(decomposition[i]);
            stringBuilder.append(numAtI);
        }

        return stringBuilder.toString();
    }

    private int[] decomposeK(int n, int k, int[] factorials) {
        // decomposition[i] gives the order index of left numbers at position i.
        int[] decomposition = new int[n];
        int left = k;
        for (int i = n-1;i >=1; --i) {
            int factor = left / factorials[i];
            if (left == factor * factorials[i]) {
                // current band
                decomposition[n-1-i] = factor - 1;
            } else {
                // next band
                decomposition[n-1-i] = factor;
            }
            left -= decomposition[n-1-i] * factorials[i];
        }
        return decomposition;
    }

    private int[] computeFactorials(int n) {
        // factorials[i] = i!
        int[] factorials = new int [n];
        factorials[0] = 1;
        for (int i = 1;i < n;++i) {
            factorials[i] = i * factorials[i-1];
        }
        return factorials;
    }
}
