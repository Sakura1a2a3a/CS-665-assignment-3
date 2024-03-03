/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: BusinessFactory.java
 * Description: Business Factory class
 */

package edu.bu.met.cs665;

/**
 * This is the BusinessFactory class.
 */

public class BusinessFactory implements Factory {

  /**
   * This is the hidden constructor.
   */
  private BusinessFactory() {
  }

  private static BusinessFactory instance = new BusinessFactory();

  /**
   * This returns singleton object.
   */

  public static BusinessFactory getInstance() {
    return instance;
  }

  /**
   * This returns email header.
   */
  public String writeTemplate() {
    return "Dear my Business customer";
  }
}
