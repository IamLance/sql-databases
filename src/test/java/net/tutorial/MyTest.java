package net.tutorial;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MyTest{
  private Math m;
  
  @Before
  public void initializeMath(){
    m = new Math();
  }
  
  @Test(timeout=1000)
  public void addShouldReturnSum() {
    assertEquals("3 + 7 should be 10", 10, m.add(3, 7));
  }
  
  @Test(timeout=1000)
  public void subShouldReturnDifference() {
    assertEquals("5 - 9 should be -4", -4, m.sub(5, 9));
  }  
  
  @Test(timeout=1000)
  public void multiplyShouldReturnProduct() {
    assertEquals("8 * 4 should be 32", 32, m.multiply(8, 4));
  }
} 
