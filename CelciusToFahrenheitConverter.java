public class CelciusToFahrenheitConverter extends TemperatureConverter
{
	static double in = 0;
	static double out = 0;

  public CelciusToFahrenheitConverter() { }

  public double convert(double inValue) {
    return (inValue*9/5)+32;
  }

  public String toString(){
    return "Celcius To Fahrenheit Converter";
  }
  
  public void print() {
	  System.out.println(toString() + " has converted " + in + " C to " + out + " F");
  }
  
  // change the input value to double and calculate the output
  public void putValues(String value) {
	  in = Double.parseDouble(value);
	  out = convert(in);
  }
  
  public static CelciusToFahrenheitConverter create() {
	  return new CelciusToFahrenheitConverter();
  }
  
};