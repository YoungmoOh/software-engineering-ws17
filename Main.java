import java.lang.reflect.Method;

class Main {
  public static void main(String[] args) throws Exception
  {
    String conversion = args[0];
    String value = args[1];
	
	// dynamically make Instance with the String value
	Class<?> cls = Class.forName(conversion);
	Object obj = cls.newInstance();
	
	// use Methods - putValues & print
	// method 'putValues' requires a string as a parameter
	Method m = cls.getDeclaredMethod("putValues", new Class[] {String.class});
	m.invoke(obj, value);
	m = cls.getDeclaredMethod("print");
	m.invoke(obj);
  }
}
