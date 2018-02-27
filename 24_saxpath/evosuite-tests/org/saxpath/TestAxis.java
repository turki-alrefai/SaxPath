/*
 * This file was automatically generated by EvoSuite
 */

package org.saxpath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.saxpath.Axis;

@RunWith(EvoSuiteRunner.class)
public class TestAxis {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Axis axis0 = new Axis();
      assertNotNull(axis0);
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = Axis.lookup(1);
      assertEquals("child", string0);
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = Axis.lookup(891);
      assertNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = Axis.lookup(2);
      assertNotNull(string0);
      assertEquals("descendant", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      String string0 = Axis.lookup(3);
      assertEquals("parent", string0);
      assertNotNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = Axis.lookup(4);
      assertEquals("ancestor", string0);
      assertNotNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      String string0 = Axis.lookup(5);
      assertNotNull(string0);
      assertEquals("following-sibling", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      String string0 = Axis.lookup(6);
      assertEquals("preceding-sibling", string0);
      assertNotNull(string0);
  }

  @Test
  public void test8()  throws Throwable  {
      String string0 = Axis.lookup(7);
      assertEquals("following", string0);
      assertNotNull(string0);
  }

  @Test
  public void test9()  throws Throwable  {
      String string0 = Axis.lookup(8);
      assertEquals("preceding", string0);
      assertNotNull(string0);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = Axis.lookup(9);
      assertEquals("attribute", string0);
      assertNotNull(string0);
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = Axis.lookup(10);
      assertNotNull(string0);
      assertEquals("namespace", string0);
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = Axis.lookup(11);
      assertEquals("self", string0);
      assertNotNull(string0);
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = Axis.lookup(12);
      assertNotNull(string0);
      assertEquals("descendant-or-self", string0);
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = Axis.lookup(13);
      assertNotNull(string0);
      assertEquals("ancestor-or-self", string0);
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = Axis.lookup("ancestor-or-self");
      assertEquals(13, int0);
  }

  @Test
  public void test16()  throws Throwable  {
      int int0 = Axis.lookup("child");
      assertEquals(1, int0);
  }

  @Test
  public void test17()  throws Throwable  {
      int int0 = Axis.lookup("descendant");
      assertEquals(2, int0);
  }

  @Test
  public void test18()  throws Throwable  {
      int int0 = Axis.lookup("parent");
      assertEquals(3, int0);
  }

  @Test
  public void test19()  throws Throwable  {
      int int0 = Axis.lookup("ancestor");
      assertEquals(4, int0);
  }

  @Test
  public void test20()  throws Throwable  {
      int int0 = Axis.lookup("following-sibling");
      assertEquals(5, int0);
  }

  @Test
  public void test21()  throws Throwable  {
      int int0 = Axis.lookup("preceding-sibling");
      assertEquals(6, int0);
  }

  @Test
  public void test22()  throws Throwable  {
      int int0 = Axis.lookup("following");
      assertEquals(7, int0);
  }

  @Test
  public void test23()  throws Throwable  {
      int int0 = Axis.lookup("preceding");
      assertEquals(8, int0);
  }

  @Test
  public void test24()  throws Throwable  {
      int int0 = Axis.lookup("attribute");
      assertEquals(9, int0);
  }

  @Test
  public void test25()  throws Throwable  {
      int int0 = Axis.lookup("namespace");
      assertEquals(10, int0);
  }

  @Test
  public void test26()  throws Throwable  {
      int int0 = Axis.lookup("self");
      assertEquals(11, int0);
  }

  @Test
  public void test27()  throws Throwable  {
      int int0 = Axis.lookup("descendant-or-self");
      assertEquals(12, int0);
  }

  @Test
  public void test28()  throws Throwable  {
      int int0 = Axis.lookup((String) null);
      assertEquals(0, int0);
  }
}
