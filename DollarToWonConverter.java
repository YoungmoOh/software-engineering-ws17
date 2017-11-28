public class DollarToWonConverter extends CurrencyConverter
{
	static double in = 0;
	static double out = 0;

  public DollarToWonConverter() { }

  public double convert(double inValue) {
    return inValue*1116;
  }

  public String toString(){
    return "Dollar to Korean Won Converter";
  }
  
  public void print() {
	  System.out.println(toString() + " has converted " + in + " USD to " + out + " KRW");
  }
  
  // change the input value to double and calculate the output
  public void putValues(String value) {
	  in = Double.parseDouble(value);
	  out = convert(in);
  }
  
  public static DollarToWonConverter create() {
	  return new DollarToWonConverter();
  }
  
};