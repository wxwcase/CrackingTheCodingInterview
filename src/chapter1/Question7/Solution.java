package chapter1.Question7;

/**
 * Created by wxwcase on 6/25/15.
 */
public class Solution {

  /**
   * Set row/column to 0 if an 0 occurs at that [row, column].
   * @param matrix input matrix, dimension: M * N
   */
  public void setZeroRowColumn(int[][] matrix) {
    // Maintain two array of boolean value indicate the state
    // First pass to set the flags
    // Second pass to set corresponding rows/columns to zero
    int M = matrix.length;
    int N = matrix[0].length;

    boolean[] rowFlag = new boolean[M];
    boolean[] colFlag = new boolean[N];

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (matrix[i][j] == 0) {
          rowFlag[i] = true;
          colFlag[j] = true;
        }
      }
    }

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (rowFlag[i]) {
          matrix[i][j] = 0;
        }
        if (colFlag[j]) {
          matrix[i][j] = 0;
        }
      }
    }
  }

}
