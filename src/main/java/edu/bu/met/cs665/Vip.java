/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: Vip.java
 * Description: Vip Customer class
 */

package edu.bu.met.cs665;

/**
 * This is the Vip class.
 */

public class Vip implements Customer {
  private Factory factory;

  /**
   * This is the constructor.
   */
  public Vip() {
    this.factory = VipFactory.getInstance();
  }

  /**
   * This returns factory.
   */
  public Factory getFactory() {
    return factory;
  }
}
