public abstract class CookingConverter extends UnitConverter
{	
	public CookingConverter() { }
	public double convert(double inValue) {
		in = inValue;
		out = in * factor;
		return out;
	}
	public static CookingConverter create() {
		return null;
	}
};