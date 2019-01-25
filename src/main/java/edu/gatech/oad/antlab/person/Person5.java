package edu.gatech.oad.antlab.person;
import java.util.Arrays;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person5 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 5 put your implementation here
	  Object[] arr2 = new Object[input.length()];
	  char[] arr = input.toCharArray();
	  for (int i = 0; i < arr.length - 2; i++) {
	  	arr2[i] = arr[i + 2];
	  }
	  arr2[arr2.length] = arr[0];
	  arr2[arr2.length] = arr[1];
	  System.out.println(arr2);
	  return Arrays.toString(arr2);
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}
