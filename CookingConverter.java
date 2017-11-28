public abstract class CookingConverter extends UnitConverter
{
  public CookingConverter() { }
  public abstract double convert(double inValue);
  public abstract String toString();
  public abstract void print();
  public static CookingConverter create() {
	  return null;
  }
};