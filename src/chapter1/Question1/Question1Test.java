package chapter1.Question1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wxwcase on 6/24/15.
 */
public class Question1Test {

  Question1 q1;

  String s1 = "";
  String s2 = "abc";
  String s3 = "abcc";
  String s4 = "abc ka";

  @org.junit.Before
  public void setUp() throws Exception {
    q1 = new Question1();
  }

  @org.junit.After
  public void tearDown() throws Exception {
    q1 = null;
  }

  @org.junit.Test
  public void testIsUniqueString() throws Exception {
    assertFalse(q1.isUniqueString(s3));
    assertTrue(q1.isUniqueString(s1));
    assertTrue(q1.isUniqueString(s2));
    assertFalse(q1.isUniqueString(s4));
  }

  @Test
  public void testIsUniqueStringFromASCII() throws Exception {
    assertTrue(q1.isUniqueStringFromASCII(s1));
    assertTrue(q1.isUniqueStringFromASCII(s2));
    assertFalse(q1.isUniqueStringFromASCII(s3));
    assertFalse(q1.isUniqueStringFromASCII(s4));
  }
}