/*
 * This file was automatically generated by EvoSuite
 */

package com.werken.saxpath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.werken.saxpath.Token;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestToken {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Token token0 = new Token((-1), "[ (", (-1671), (-1671));
      int int0 = token0.getTokenType();
      assertEquals(-1671, token0.getTokenEnd());
      assertEquals(-1671, token0.getTokenBegin());
      assertEquals((-1), int0);
  }

  @Test
  public void test1()  throws Throwable  {
      Token token0 = new Token(1, "[ (", 1, 1);
      String string0 = token0.toString();
      assertNotNull(string0);
      assertEquals("[ (1) ()", string0);
  }
}
