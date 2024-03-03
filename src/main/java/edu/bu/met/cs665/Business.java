/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: Business.java
 * Description: Business Customer class
 */

package edu.bu.met.cs665;

/**
 * This is the Business class.
 */

public class Business implements Customer {
  private Factory factory;

  /**
   * This is the constructor.
   */
  public Business() {
    this.factory = BusinessFactory.getInstance();
  }

  /**
   * This returns factory.
   */
  public Factory getFactory() {
    return factory;
  }
}
