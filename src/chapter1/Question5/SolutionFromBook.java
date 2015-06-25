package chapter1.Question5;

/**
 * Created by wxwcase on 6/25/15.
 */
public class SolutionFromBook {

  public String compress(String str) {

    // edge case
    int size = countCompression(str);
    if (size >= str.length()) {
      return str;
    }

    char[] array = new char[size];
    int index = 0;
    char last = str.charAt(0);
    int count = 1;
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == last) {
        count++;
      } else {
        index = setChar(array, last, index, count);
        last = str.charAt(i);
        count = 1;
      }
    }

    // update string with the last set of repeated characters
    index = setChar(array, last, index, count);
    return String.valueOf(array);
  }

  public int setChar(char[] array, char c, int index, int count) {
    array[index] = c;
    index++;

    // convert count to a string, then to an array of chars
    char[] cnt = String.valueOf(count).toCharArray();
    for (char x : cnt) {
      array[index++] = x;
    }
    return index;
  }

  private int countCompression(String str) {
    if (str == null || str.isEmpty()) {
      return 0;
    }
    char last = str.charAt(0);
    int size = 0;
    int count = 1;
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == last) {
        count++;
      } else {
        last = str.charAt(i);
        size += 1 + String.valueOf(count).length();
        count = 1;
      }
    }
    size += 1 + String.valueOf(count).length();
    return size;
  }
}
