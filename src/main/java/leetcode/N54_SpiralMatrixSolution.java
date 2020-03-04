package leetcode;

import java.util.ArrayList;
import java.util.List;

public class N54_SpiralMatrixSolution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> scannedValues = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return scannedValues;
        }
        recursiveSpiralOrder(matrix, 0, matrix.length - 1, 0, matrix[0].length - 1,
                scannedValues);
        return scannedValues;
    }

    private void recursiveSpiralOrder(int[][] matrix, int rowStart, int rowEnd, int colStart,
                                      int colEnd, List<Integer> valuesScanned) {
        if (rowEnd < rowStart || colEnd < colStart) {
            return;
        }

        if (rowStart == rowEnd) {
            // single row
            for (int i = colStart; i <= colEnd; ++i) {
                valuesScanned.add(matrix[rowStart][i]);
            }
            return;
        } else if (colStart == colEnd) {
            // single column
            for (int i = rowStart; i <= rowEnd; ++i) {
                valuesScanned.add(matrix[i][colStart]);
            }
            return;
        }

        // add row at rowStart
        for (int i = colStart; i <= colEnd; ++i) {
            valuesScanned.add(matrix[rowStart][i]);
        }

        // add col at colEnd
        for (int i = rowStart+1; i <= rowEnd; ++i) {
            valuesScanned.add(matrix[i][colEnd]);
        }

        // add row at rowEnd
        for (int i = colEnd-1; i >= rowStart; --i) {
            valuesScanned.add(matrix[rowEnd][i]);
        }

        // add col at colStart
        for (int i = rowEnd-1; i >= rowStart+1; --i) {
            valuesScanned.add(matrix[i][colStart]);
        }

        recursiveSpiralOrder(matrix, rowStart+1, rowEnd-1, colStart+1, colEnd-1, valuesScanned);
    }
}
