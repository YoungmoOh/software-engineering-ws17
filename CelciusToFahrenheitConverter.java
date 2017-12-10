public class CelciusToFahrenheitConverter extends TemperatureConverter
{
	// initialization
	public CelciusToFahrenheitConverter() {
		inMetric = "Celcius";
		outMetric = "Fahrenheit";
		factor = 9/5;
	}

  public double convert(double inValue) {
    return (inValue*factor)+32;
  }
  
  public static CelciusToFahrenheitConverter create() {
	  return new CelciusToFahrenheitConverter();
  }
  
};