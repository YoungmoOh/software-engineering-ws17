public abstract class CurrencyConverter extends UnitConverter
{
  public CurrencyConverter() { }
  public abstract double convert(double inValue);
  public abstract String toString();
  public abstract void print();
  public abstract void putValues(String value);
  public static CurrencyConverter create() {
	  return null;
  }
};
