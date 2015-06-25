package chapter1.Question3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wxwcase on 6/24/15.
 */
public class Question3 {

  /**
   * Decide the two input strings are permutation of each other.
   * @param left input string one
   * @param right input string two
   * @return true if they are permutation to each other
   */
  public boolean isPermutationBetween(String left, String right) {

    if (left.length() != right.length()) {
      return false;
    }

    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < left.length(); i++) {
      Integer val = map.get(left.charAt(i));
      if (val == null) {
        map.put(left.charAt(i), 1);
      } else {
        map.put(left.charAt(i), ++val);
      }
    }

    for (int i = 0; i < right.length(); i++) {
      Integer val = map.get(right.charAt(i));
      if(val == null || val == 0) {
        return false;
      } else {
        map.put(right.charAt(i), --val);
      }
    }
    return true;
  }
}
