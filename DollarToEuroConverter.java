public class DollarToEuroConverter extends CurrencyConverter
{
	static double in = 0;
	static double out = 0;

  public DollarToEuroConverter() { }

  public double convert(double inValue) {
    return inValue*0.85;
  }

  public String toString(){
    return "Dollar to Euro Converter";
  }
  
  public void print() {
	  System.out.println(toString() + " has converted " + in + " USD to " + out + " EUR");
  }

  // change the input value to double and calculate the output
  public void putValues(String value) {
	  in = Double.parseDouble(value);
	  out = convert(in);
  }
  
  public static DollarToEuroConverter create() {
	  return new DollarToEuroConverter();
  }
  
};