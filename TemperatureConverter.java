public abstract class TemperatureConverter extends UnitConverter
{
  public TemperatureConverter() { }
  public static TemperatureConverter create() {
	  return null;
  }
}

class ValueOutOfRangeException extends Exception {
	  String err_msg;
	  
	  ValueOutOfRangeException(String exp) {
		  super(exp);
	  }
	  
	  public String toSring() {
		  return err_msg;
	  }
}