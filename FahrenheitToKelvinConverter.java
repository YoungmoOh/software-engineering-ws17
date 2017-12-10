public class FahrenheitToKelvinConverter extends TemperatureConverter
{
	// initialization
	public FahrenheitToKelvinConverter() {
		inMetric = "Fahrenheit";
		outMetric = "Kelvin";
		factor = 0.55;
	}

  public double convert(double inValue) {
		in = inValue;
		out = (in + 459.67) * factor;
		return out;
  }
  
  public static FahrenheitToKelvinConverter create() {
	  return new FahrenheitToKelvinConverter();
  }
  
};