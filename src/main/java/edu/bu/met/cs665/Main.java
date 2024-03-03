/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: Main.java
 * Description: Client class
 */

package edu.bu.met.cs665;


/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   */
  public static void main(String[] args) {
    Customer customerBusiness = new Business();
    Customer customerReturning = new Returning();
    Customer customerFrequent = new Frequent();
    Customer customerNew = new New();
    Customer customerVip = new Vip();

    EmailBuilder builder = new EmailBuilder();
    System.out.println(builder.write(customerBusiness));
    System.out.println(builder.write(customerReturning));
    System.out.println(builder.write(customerFrequent));
    System.out.println(builder.write(customerNew));
    System.out.println(builder.write(customerVip));

  }

}
