package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
	* This is  a method : greet
	* This method returns a  string
  */

  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
