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
	  
	  // the value should be double
	  while (!isDouble(value)) {
		  Scanner scan2 = new Scanner(System.in);
		  System.out.print("Please enter a double value: ");
		  value = scan2.nextLine();
	  }
	  
	  // Get the Single Instance of the factory
	  ConverterFactory factory = ConverterFactory.getInstance();
	  
	  // Get the corresponding converter
	  UnitConverter converter = factory.create(conversion);;
	  
	  // Calculate and print the result
	  converter.putValues(value);
	  converter.print();
  }
  
  // is the string parsable as double?
  public static boolean isDouble(String value) {
	  try {
		  Double.parseDouble(value);
	  } catch(NumberFormatException e) {
		  return false;
	  }
	  return true;
  }
}
