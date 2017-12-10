public class CelciusToFahrenheitConverter extends TemperatureConverter
{
	// initialization
	public CelciusToFahrenheitConverter() {
		inMetric = "Celcius";
		outMetric = "Fahrenheit";
		factor = 1.8;
	}

  public double convert(double inValue) {
		in = inValue;
		out = (in * factor) + 32;
		return out;
  }
  
  public static CelciusToFahrenheitConverter create() {
	  return new CelciusToFahrenheitConverter();
  }
  
};