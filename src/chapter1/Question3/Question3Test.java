package chapter1.Question3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wxwcase on 6/24/15.
 */
public class Question3Test {

  Question3 q3;
  String s1 = "";

  String s2 = "abc";
  String s3 = "bca";

  String s4 = "abc de";
  String s5 = " dcbea";

  String s6 = "abcde";
  String s7 = "slkd ";

  @Before
  public void setUp() throws Exception {
    q3 = new Question3();
  }

  @After
  public void tearDown() throws Exception {
    q3 = null;
  }

  @Test
  public void testIsPermutationBetween() throws Exception {
    assertTrue(q3.isPermutationBetween(s1, s1));
    assertTrue(q3.isPermutationBetween(s2, s3));
    assertTrue(q3.isPermutationBetween(s4, s5));
    assertFalse(q3.isPermutationBetween(s6, s7));
  }
}