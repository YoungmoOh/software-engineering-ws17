public abstract class UnitConverter
{
  public UnitConverter() { }
  public abstract double convert(double inValue);
  public abstract String toString();
  public abstract void print();
  public abstract void putValues(String value);
  public static UnitConverter create() {
	  return null;
  }
};

