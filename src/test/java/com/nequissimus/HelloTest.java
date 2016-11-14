package com.nequissimus;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {
  @Test
  public void getHello() throws Exception {
    Assert.assertEquals("Function did not return 'Hello'", "Hello", Hello.getHello());
  }
}
