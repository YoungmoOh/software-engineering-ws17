public class CupToTspConverter extends CookingConverter
{
	// initialization
	public CupToTspConverter() {
	  inMetric = "Cup";
	  outMetric = "Tsp";
	  factor = 48;
	}
	
	// Decorator: extending the functionality 
	public CupToTspConverter(CookingConverter base) {

		//throw an exception when metrics don't match for a decorator
		try {
			if(base.outMetric != "Cup")
				throw new UnmatchedMetricsException("Incoming value should be Cup!");
		}
		catch(UnmatchedMetricsException e) {
			System.out.println(e);
			System.exit(1);
		}
		
		// extension
		inMetric = base.inMetric;
		outMetric = "Tsp";
		factor = base.factor * 48;
	}

  public static CupToTspConverter create() {
	  return new CupToTspConverter();
  }
  
};