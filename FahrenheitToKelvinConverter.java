public class FahrenheitToKelvinConverter extends TemperatureConverter
{
	// initialization
	public FahrenheitToKelvinConverter() {
		inMetric = "Fahrenheit";
		outMetric = "Kelvin";
		factor = 5/9;
	}

  public double convert(double inValue) {
    return (inValue + 459.67) * factor;
  }
  
  public static FahrenheitToKelvinConverter create() {
	  return new FahrenheitToKelvinConverter();
  }
  
};