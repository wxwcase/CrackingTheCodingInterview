package chapter1.Question1;

import java.util.HashSet;
import java.util.Set;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * Cannot use additional data structures
 */
public class Question1 {

  /**
   * Determine if the input string has duplicate character.
   * @param input input string
   * @return true if the input has no duplicate characters
   */
  public boolean isUniqueString(String input) {

    Set<Character> set = new HashSet<>();

    for (int i = 0; i < input.length(); i++) {
      if (!set.add(input.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  /**
   * Assume input is character from 'a' to 'z'.
   * @param input input string
   * @return true if input string has no duplicate character
   */
  public boolean isUniqueStringFromASCII(String input) {

    int checker = 0;

    for (int i = 0; i < input.length(); i++) {
      int val = input.charAt(i) - 'a';
      if ((checker & (1 << val)) > 0) {
        return false;
      }
      checker |= 1 << val;
    }

    return true;
  }
}
