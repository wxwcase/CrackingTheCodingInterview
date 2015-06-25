package chapter1.Question5;

/**
 * Created by wxwcase on 6/25/15.
 */
public class Solution {

  /**
   * Compress string for continuous repeated character.
   * @param str
   * @return original string if the compressed length is larger.
   */
  public String compression(String str) {

    StringBuilder sb = new StringBuilder();
    int count = 1;
    char last = str.charAt(0);

    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == last) {
        count++;
      } else {
        sb.append(last);
        sb.append(String.valueOf(count));
        last = str.charAt(i);
        count = 1;
      }
    }
    sb.append(last);
    sb.append(count);

    if (sb.length() >= str.length()) {
      return str;
    } else {
      return sb.toString();
    }
  }
}
