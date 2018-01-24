public class CelciusToFahrenheitConverter extends TemperatureConverter
{
	// initialization
	public CelciusToFahrenheitConverter() {
		inMetric = "Celcius";
		outMetric = "Fahrenheit";
		factor = 1.8;
	}

  public double convert(double inValue) {

	  try {
		  if(inValue < -273.15) {
			  throw new ValueOutOfRangeException("Celcius should be above -273.15!");
		  }
	  } catch (ValueOutOfRangeException e) {
		  System.out.println(e);
		  System.exit(1);
	  }
	  
	  	in = inValue;
		out = (in * factor) + 32;
		return out;
  }
  
  public static CelciusToFahrenheitConverter create() {
	  return new CelciusToFahrenheitConverter();
  }
  
};