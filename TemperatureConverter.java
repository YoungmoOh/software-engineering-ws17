public abstract class TemperatureConverter extends UnitConverter
{
  public TemperatureConverter() { }
  public abstract double convert(double inValue);
  public abstract String toString();
  public abstract void print();
  public static TemperatureConverter create() {
	  return null;
  }
};