package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

  @Test
  public void testBusiness() {
    EmailBuilder builder = new EmailBuilder();
    Customer customerBusiness = new Business();
    assertEquals("Dear my Business customer", builder.write(customerBusiness));
  }

  @Test
  public void testReturning() {
    EmailBuilder builder = new EmailBuilder();
    Customer customerReturning = new Returning();
    assertEquals("Dear my Returning customer", builder.write(customerReturning));
  }

  @Test
  public void testFrequent() {
    EmailBuilder builder = new EmailBuilder();
    Customer customerFrequent = new Frequent();
    assertEquals("Dear my Frequent customer", builder.write(customerFrequent));
  }

  @Test
  public void testNew() {
    EmailBuilder builder = new EmailBuilder();
    Customer customerNew = new New();
    assertEquals("Dear my New customer", builder.write(customerNew));
  }

  @Test
  public void testVip() {
    EmailBuilder builder = new EmailBuilder();
    Customer customerVip = new Vip();
    assertEquals("Dear my Vip customer", builder.write(customerVip));
  }


}
