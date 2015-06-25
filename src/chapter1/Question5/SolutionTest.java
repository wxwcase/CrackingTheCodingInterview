package chapter1.Question5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wxwcase on 6/25/15.
 */
public class SolutionTest {

  Solution sol;

  String s1 = "aabbccddd";
  String r1 = "a2b2c2d3";

  String s2 = "aabbcc";
  String s3 = "aaabc";

  @Before
  public void setUp() throws Exception {
    sol = new Solution();
  }

  @After
  public void tearDown() throws Exception {
    sol = null;
  }

  @Test
  public void testCompression() throws Exception {
    assertEquals(r1, sol.compression(s1));
    assertEquals(s2, sol.compression(s2));
    assertEquals(s3, sol.compression(s3));
  }
}