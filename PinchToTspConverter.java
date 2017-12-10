public class PinchToTspConverter extends CookingConverter
{
	// initialization
	public PinchToTspConverter() {
	  inMetric = "Pinch";
	  outMetric = "Tsp";
	  factor = 0.125;
	}
	
	// Decorator: extending the functionality 
	public PinchToTspConverter(CookingConverter base) {
		
		//throw an exception when metrics don't match for a decorator
		try {
			if(base.outMetric != "Pinch")
				throw new UnmatchedMetricsException("Incoming value should be Pinch!");
		}
		catch(UnmatchedMetricsException e) {
			System.out.println(e);
			System.exit(1);
		}
		
		// extension
		inMetric = base.inMetric;
		outMetric = "Tsp";
		factor = base.factor / 8;
	}
  
	public static PinchToTspConverter create() {
		return new PinchToTspConverter();
	}
	
};