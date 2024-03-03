/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: ReturningFactory.java
 * Description: Returning Factory class
 */

package edu.bu.met.cs665;

public class ReturningFactory implements Factory {

  /**
   * This is the ReturningFactory class.
   */
  private ReturningFactory() {
  }

  /**
   * This is the hidden constructor.
   */
  private static ReturningFactory instance = new ReturningFactory();

  /**
   * This returns singleton object.
   */
  public static ReturningFactory getInstance() {
    return instance;
  }

  /**
   * This returns email header.
   */
  public String writeTemplate() {
    return "Dear my Returning customer";
  }
}
