package chapter1.Question8;

/**
 * Created by wxwcase on 6/26/15.
 */
public class Solution {

  /**
   * Assume you have isSubstring method to check if sub is substring of str.
   * Given s1, s2, check if s2 is rotation of s1 using isSubstring only once.
   * @param s1
   * @param toS2
   * @return
   */
  public boolean isRotationFrom(String s1, String toS2) {
    // s1 = xy
    // toS2 = yx
    // so only need to check if toS2 is rotation of xyxy(s1s1).
    return isSubstring(s1 + s1, toS2);
  }

  public boolean isSubstring(String str, String sub) {
    // code
    return false;
  }
}
