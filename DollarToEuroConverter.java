public class DollarToEuroConverter extends CurrencyConverter
{
	// initialization
	public DollarToEuroConverter() {
	  inMetric = "Dollar";
	  outMetric = "Euro";
	  factor = 0.85;
	}
	
	// Decorator: extending the functionality 
	public DollarToEuroConverter(UnitConverter base) {

		//throw an exception when metrics don't match for a decorator
		try {
			if(base.outMetric != "Dollar")
				throw new UnmatchedMetricsException("Incoming value should be Dollar!");
		}
		catch(UnmatchedMetricsException e) {
			System.out.println(e);
			System.exit(1);
		}
		
		// extension
		inMetric = base.inMetric;
		outMetric = "Euro";
		factor = base.factor * 0.85;
	}
  
	public static DollarToEuroConverter create() {
		return new DollarToEuroConverter();
	}
	
};