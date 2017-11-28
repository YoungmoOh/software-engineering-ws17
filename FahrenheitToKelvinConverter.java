public class FahrenheitToKelvinConverter extends TemperatureConverter
{
	static double in = 0;
	static double out = 0;

  public FahrenheitToKelvinConverter() { }

  public double convert(double inValue) {
    return (inValue+459.67)*5/9;
  }

  public String toString(){
    return "Fahrenheit To Kelvin Converter";
  }
  
  public void print() {
	  System.out.println(toString() + " has converted " + in + " F to " + out + " K");
  }
  
  // change the input value to double and calculate the output
  public void putValues(String value) {
	  in = Double.parseDouble(value);
	  out = convert(in);
  }
  
  public static FahrenheitToKelvinConverter create() {
	  return new FahrenheitToKelvinConverter();
  }
  
};