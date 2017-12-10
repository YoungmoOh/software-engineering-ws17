public class DollarToWonConverter extends CurrencyConverter
{
	// initialization
	public DollarToWonConverter() {
	  inMetric = "Dollar";
	  outMetric = "Won";
	  factor = 1116;
	}
	
	// Decorator: extending the functionality 
	public DollarToWonConverter(UnitConverter base) {
		
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
		outMetric = "Won";
		factor = base.factor * 1116;
	}
  
	public static DollarToWonConverter create() {
		return new DollarToWonConverter();
	}
	
};