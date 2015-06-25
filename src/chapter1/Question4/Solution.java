package chapter1.Question4;

/**
 * Created by wxwcase on 6/24/15.
 */
public class Solution {

  /**
   * Replace space with '%20' in the input character array.
   * @param input input character array
   * @param length length of the array
   */
  public void replaceWhiteSpace(char [] input, int length) {
    char[] output = new char[length];
    int position = 0;
    for (int i = 0; i < length; i++) {
      if (input[i] == ' ') {
        output[position++] = '%';
        output[position++] = '2';
        output[position++] = '0';
      } else {
        output[position++] = input[i];
      }
    }
  }


  /**
   * Solution
   * @param str
   * @param length
   */
  public void solution(char[] str, int length) {
    int spaceCount = 0;
    int newLength = 0;
    for (int i = 0; i < length; i++) {
      if (str[i] == ' ') {
        spaceCount++;
      }
    }
    newLength = length + spaceCount * 2;
    for (int i = length - 1; i >= 0; i--) {
      if (str[i] == ' ') {
        str[newLength - 1] = '0';
        str[newLength - 2] = '2';
        str[newLength - 3] = '%';
        newLength -= 3;
      } else {
        str[newLength - 1] = str[i];
        newLength--;
      }
    }
  }
}
