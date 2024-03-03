/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: FrequentFactory.java
 * Description: Frequent Factory class
 */

package edu.bu.met.cs665;

/**
 * This is the FrequentFactory class.
 */

public class FrequentFactory implements Factory {

  /**
   * This is the hidden constructor.
   */
  private FrequentFactory() {
  }

  private static FrequentFactory instance = new FrequentFactory();

  /**
   * This returns singleton object.
   */

  public static FrequentFactory getInstance() {
    return instance;
  }

  /**
   * This returns email header.
   */
  public String writeTemplate() {
    return "Dear my Frequent customer";
  }
}
