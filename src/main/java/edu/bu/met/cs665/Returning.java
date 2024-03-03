/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: Returning.java
 * Description: Returning Customer class
 */

package edu.bu.met.cs665;

/**
 * This is the Returning class.
 */

public class Returning implements Customer {
  private Factory factory;

  /**
   * This is the constructor.
   */
  public Returning() {
    this.factory = ReturningFactory.getInstance();
  }

  /**
   * This returns factory.
   */
  public Factory getFactory() {
    return factory;
  }
}
