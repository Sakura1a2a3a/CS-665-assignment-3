/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: Frequent.java
 * Description: Frequent Customer class
 */

package edu.bu.met.cs665;

/**
 * This is the Frequent class.
 */

public class Frequent implements Customer {
  private Factory factory;

  /**
   * This is the Constructor.
   */
  public Frequent() {
    this.factory = FrequentFactory.getInstance();
  }

  /**
   * This gets factory object.
   */
  public Factory getFactory() {
    return factory;
  }
}
