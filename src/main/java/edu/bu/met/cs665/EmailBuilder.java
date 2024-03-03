/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: EmailBuilder.java
 * Description: Email Builder class
 */

package edu.bu.met.cs665;

/**
 * This is the EmailBuilder class.
 */

public class EmailBuilder {

  /**
   * Write email method.
   */
  public String write(Customer customer) {
    return customer.getFactory().writeTemplate();
  }
}
