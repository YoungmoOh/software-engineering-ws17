import java.lang.reflect.Method;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws Exception
  {
	  String conversion;
	  String value;
	  
	  // when two parameters are directly given with main function call
	  try {
		    conversion = args[0];
		    value = args[1];
	  } // otherwise, get the parameters
	  catch(ArrayIndexOutOfBoundsException e) {
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Enter Converter: ");
		  conversion = scan.nextLine();
		  
		  System.out.print("Enter a value: ");
		  value = scan.nextLine();
	  }
	  
	  while (!isDouble(value)) {	// the value should be double
		  Scanner scan2 = new Scanner(System.in);
		  System.out.print("Please enter a double value: ");
		  value = scan2.nextLine();
	  }
	
	// dynamically make Instance with the String value
	Class<?> cls = Class.forName(conversion);
	Object obj = cls.newInstance();
	
	// use Methods - putValues & print
	// method 'putValues' requires a string as a parameter
	Method m = cls.getDeclaredMethod("putValues", new Class[] {String.class});
	m.invoke(obj, value);
	m = cls.getDeclaredMethod("print");
	m.invoke(obj);
  }
  
  public static boolean isDouble(String value) {
	  try {
		  Double.parseDouble(value);
	  } catch(NumberFormatException e) {
		  return false;
	  }
	  return true;
  }
}
