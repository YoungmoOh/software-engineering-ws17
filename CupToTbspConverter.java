public class CupToTbspConverter extends CookingConverter
{
	static double in = 0;
	static double out = 0;

  public CupToTbspConverter() { }

  public double convert(double inValue) {
    return inValue*16;
  }

  public String toString(){
    return "Cups to Tablespoons Converter";
  }
  
  public void print() {
	  System.out.println(toString() + " has converted " + in + " Cup(s) to " + out + " Tbsp");
  }
  
  // change the input value to double and calculate the output
  public void putValues(String value) {
	  in = Double.parseDouble(value);
	  out = convert(in);
  }
  
};