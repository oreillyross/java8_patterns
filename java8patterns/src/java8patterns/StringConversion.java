/**
 * 
 */
package java8patterns;

/**
 * conversion from a string to a double-precision
 * floating-point value, and shows two methods for getting back to a string again.
 *
 */
public class StringConversion {

	
	public static void main(String[] args) {
		double pi;
		String strval;

		pi = Double.parseDouble("3.14");
		
		/*The String class implements this method, and it is overloaded for each of the primitive data types. 
		Alternatively, the wrapper classes also implement toString() methods that you can invoke to convert 
		values of the underlying type into their human-readable forms. It’s your own
		preference as to which approach to take.*/
		
		System.out.println(strval = String.valueOf(pi));
		
		/* The wrapper classes implement helper methods such as Double.parseDouble(), Long.parseLong(), 
		 * Boolean.parseBoolean(), and so forth. These parse
		 * methods convert human-readable representations into values of the respective types.
		 */
		
		System.out.println(Double.toString(pi));




	}

}
