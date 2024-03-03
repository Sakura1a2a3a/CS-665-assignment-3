/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: New.java
 * Description: New Customer class
 */

package edu.bu.met.cs665;

/**
 * This is the New class.
 */

public class New implements Customer {
  private Factory factory;

  /**
   * This is the constructor.
   */
  public New() {
    this.factory = NewFactory.getInstance();
  }

  /**
   * This returns factory.
   */
  public Factory getFactory() {
    return factory;
  }
}
