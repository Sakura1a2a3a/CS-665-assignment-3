/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: NewFactory.java
 * Description: New Factory class
 */

package edu.bu.met.cs665;

/**
 * This is the NewFactory class.
 */

public class NewFactory implements Factory {

  /**
   * This is the hidden constructor.
   */
  private NewFactory() {
  }

  private static NewFactory instance = new NewFactory();

  /**
   * This returns singleton object.
   */

  public static NewFactory getInstance() {
    return instance;
  }

  /**
   * This returns email header.
   */
  public String writeTemplate() {
    return "Dear my New customer";
  }
}
