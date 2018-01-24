public class FahrenheitToKelvinConverter extends TemperatureConverter
{
	// initialization
	public FahrenheitToKelvinConverter() {
		inMetric = "Fahrenheit";
		outMetric = "Kelvin";
		factor = 0.55;
	}

  public double convert(double inValue) {
	
	  try {
		  if(inValue < -459.67) {
			  throw new ValueOutOfRangeException("Fahrenheit should be above -459.67!");
		  }
	  } catch (ValueOutOfRangeException e) {
		  System.out.println(e);
		  System.exit(1);
	  }
	  
	  	in = inValue;
		out = (in + 459.67) * factor;
		return out;
  }
  
  public static FahrenheitToKelvinConverter create() {
	  return new FahrenheitToKelvinConverter();
  }
  
};