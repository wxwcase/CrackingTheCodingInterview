package chapter1.Question6;

/**
 * Created by wxwcase on 6/25/15.
 */
public class Solution {

  /**
   * Rotate image by 90 degree in place.
   * Image is represented by int matrix.
   * @return result
   */
  public void rotateImage(int[][] image) {

    int layers = image.length / 2;

    for (int layer = 0; layer < layers; layer++) {
      int last = image.length - 1 - layer;
      for (int i = layer; i < last; i++) {
        int offset = i - layer;
        // top to tmp
        int top = image[layer][i];
        // left to top
        image[layer][i] = image[image.length - 1 - i][layer];
        // bottom to left
        image[image.length - 1 - i][layer] = image[last][image.length - 1 - i];
        // right to bottom
        image[last][image.length - 1 - i] = image[i][layer];
        // top to right
        image[i][last] = top;
      }
    }

  }
}
