public class EuroToWonConverter extends CurrencyConverter
{
	// initialization
	public EuroToWonConverter() {
	  inMetric = "Euro";
	  outMetric = "Won";
	  factor = 1300;
	}
	
	// Decorator: extending the functionality 
	public EuroToWonConverter(UnitConverter base) {

		//throw an exception when metrics don't match for a decorator
		try {
			if(base.outMetric != "Euro")
				throw new UnmatchedMetricsException("Incoming value should be Euro!");
		}
		catch(UnmatchedMetricsException e) {
			System.out.println(e);
			System.exit(1);
		}
		
		// extension
		inMetric = base.inMetric;
		outMetric = "Won";
		factor = base.factor * 1300;
	}
  
	public static EuroToWonConverter create() {
		return new EuroToWonConverter();
	}
	
};