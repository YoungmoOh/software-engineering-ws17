public class EuroToWonConverter extends CurrencyConverter
{
	static double in = 0;
	static double out = 0;

  public EuroToWonConverter() { }

  public double convert(double inValue) {
    return inValue*1300;
  }

  public String toString(){
    return "Euro to Korean Won Converter";
  }
  
  public void print() {
	  System.out.println(toString() + " has converted " + in + " EUR to " + out + " KRW");
  }
  
  // change the input value to double and calculate the output
  public void putValues(String value) {
	  in = Double.parseDouble(value);
	  out = convert(in);
  }
  
  public static EuroToWonConverter create() {
	  return new EuroToWonConverter();
  }
  
};