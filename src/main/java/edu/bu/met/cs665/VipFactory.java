/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: VipFactory.java
 * Description: Vip Factory class
 */

package edu.bu.met.cs665;

/**
 * This is the VipFactory class.
 */

public class VipFactory implements Factory {

  /**
   * This is the hidden constructor.
   */
  private VipFactory() {
  }

  private static VipFactory instance = new VipFactory();

  /**
   * This returns singleton object.
   */
  public static VipFactory getInstance() {
    return instance;
  }

  /**
   * This returns email header.
   */
  public String writeTemplate() {
    return "Dear my Vip customer";
  }
}
