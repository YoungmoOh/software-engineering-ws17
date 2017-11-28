public class PinchToTspConverter extends CookingConverter
{
	static double in = 0;
	static double out = 0;

  public PinchToTspConverter() { }

  public double convert(double inValue) {
    return inValue/8;
  }

  public String toString(){
    return "Pinchs To Teaspoons Converter";
  }
  
  public void print() {
	  System.out.println(toString() + " has converted " + in + " Pinch(s) to " + out + " Tsp");
  }
  
  // change the input value to double and calculate the output
  public void putValues(String value) {
	  in = Double.parseDouble(value);
	  out = convert(in);
  }
  
  public static PinchToTspConverter create() {
	  return new PinchToTspConverter();
  }
  
};