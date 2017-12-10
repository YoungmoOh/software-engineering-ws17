import TinyTestJ.Test;
import static TinyTestJ.Assert.*;

public class TestSuite {
  @Test public static void DETest1() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(Double.MAX_VALUE);
    assertEquals(1.5280391646329683E308, result,0.001);
  }
  @Test public static void DETest2() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(-1);
    assertEquals(-0.85, result,0.001);
  }
  @Test public static void DETest3() {
	  UnitConverter test = new DollarToEuroConverter();
	  double result = test.convert(Double.MIN_VALUE);
	  assertEquals(4.9E-324, result,0.001);
  }
    @Test public static void DETest4() {
        UnitConverter test = new DollarToWonConverter();
        double result = test.convert(Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.001);
    }
    @Test public static void DETest5() {
        UnitConverter test = new DollarToWonConverter();
        double result = test.convert(-1);
        assertEquals(-1116, result, 0.001);
    }
    @Test public static void DETest6() {
        UnitConverter test = new DollarToWonConverter();
        double result = test.convert(Double.MIN_VALUE);
        assertEquals(5.514E-321, result, 0.001);
    }
    @Test public static void DETest7() {
        UnitConverter test = new EuroToWonConverter();
        double result = test.convert(Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.001);
    }
    @Test public static void DETest8() {
        UnitConverter test = new EuroToWonConverter();
        double result = test.convert(-100);
        assertEquals(-130000, result, 0.001);
    }
    @Test public static void DETest9() {
        UnitConverter test = new EuroToWonConverter();
        double result = test.convert(Double.MIN_VALUE);
        assertEquals(6.423E-321, result, 0.001);
    }
    @Test public static void DETest10() {
        UnitConverter test = new CelciusToFahrenheitConverter();
        double result = test.convert(Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.001);
    }
    @Test public static void DETest11() {
        UnitConverter test = new CelciusToFahrenheitConverter();
        double result = test.convert(9);
        assertEquals(48.2, result, 0.001);
    }
    @Test public static void DETest12() {
        UnitConverter test = new CelciusToFahrenheitConverter();
        double result = test.convert(Double.MIN_VALUE);
        assertEquals(32, result, 0.001);
    }
    @Test public static void DETest13() {
        UnitConverter test = new FahrenheitToKelvinConverter();
        double result = test.convert(Double.MAX_VALUE);
        assertEquals(9.887312241742736E307, result, 0.001);
    }
    @Test public static void DETest14() {
        UnitConverter test = new FahrenheitToKelvinConverter();
        double result = test.convert(92);
        assertEquals(303.418, result, 0.001);
    }
    @Test public static void DETest15() {
        UnitConverter test = new FahrenheitToKelvinConverter();
        double result = test.convert(Double.MIN_VALUE);
        assertEquals(252.818, result, 0.001);
    }
    @Test public static void DETest16() {
        UnitConverter test = new PinchToTspConverter();
        double result = test.convert(Double.MAX_VALUE);
        assertEquals(2.2471164185778946E307, result, 0.001);
    }
    @Test public static void DETest17() {
        UnitConverter test = new PinchToTspConverter();
        double result = test.convert(1);
        assertEquals(0.125, result, 0.001);
    }
    @Test public static void DETest18() {
        UnitConverter test = new PinchToTspConverter();
        double result = test.convert(Double.MIN_VALUE);
        assertEquals(0, result, 0.001);
    }
    @Test public static void DETest19() {
        UnitConverter test = new CupToTspConverter();
        double result = test.convert(Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.001);
    }
    @Test public static void DETest20() {
        UnitConverter test = new CupToTspConverter();
        double result = test.convert(14);
        assertEquals(672, result, 0.001);
    }
    @Test public static void DETest21() {
        UnitConverter test = new CupToTspConverter();
        double result = test.convert(Double.MIN_VALUE);
        assertEquals(7.9E-323, result, 0.001);
    }
    
	//---------Singleton Test---------//
    // Same objects have the same hash code
    // Incomplete: different objects can also have the same hash code
    @Test public static void SingletonTest1() {
    	ConverterFactory test1 = ConverterFactory.getInstance();
    	ConverterFactory test2 = ConverterFactory.getInstance();
    	assertEquals(test1.hashCode(), test2.hashCode(), 0.001);
    }
    // a little hacky way to test Singleton
    // 'equals' yields true on the same objects
    @Test public static void SingletonTest2() {
    	ConverterFactory test1 = ConverterFactory.getInstance();
    	ConverterFactory test2 = ConverterFactory.getInstance();
    	if(test1.equals(test2) == true)
    		assertEquals(1, 1, 0);
    	else assertEquals(1, 2, 0);
    }
    
	//---------Abstract Factory Test---------//
    // directly created converter and factory-made converter must have the same result
    public static double value = 5.0;	// test value for factory tests
 
    @Test public static void FactoryTest1() {
    	UnitConverter test1 = new DollarToEuroConverter();
    	UnitConverter test2 = ConverterFactory.getInstance().create("DollarToEuroConverter");
    	assertEquals(test1.convert(value), test2.convert(value), 0.001);
    }
    @Test public static void FactoryTest2() {
    	UnitConverter test1 = new DollarToWonConverter();
    	UnitConverter test2 = ConverterFactory.getInstance().create("DollarToWonConverter");
    	assertEquals(test1.convert(value), test2.convert(value), 0.001);
    }
    @Test public static void FactoryTest3() {
    	UnitConverter test1 = new EuroToWonConverter();
    	UnitConverter test2 = ConverterFactory.getInstance().create("EuroToWonConverter");
    	assertEquals(test1.convert(value), test2.convert(value), 0.001);
    }
    @Test public static void FactoryTest4() {
    	UnitConverter test1 = new CelciusToFahrenheitConverter();
    	UnitConverter test2 = ConverterFactory.getInstance().create("CelciusToFahrenheitConverter");
    	assertEquals(test1.convert(value), test2.convert(value), 0.001);
    }
    @Test public static void FactoryTest5() {
    	UnitConverter test1 = new FahrenheitToKelvinConverter();
    	UnitConverter test2 = ConverterFactory.getInstance().create("FahrenheitToKelvinConverter");
    	assertEquals(test1.convert(value), test2.convert(value), 0.001);
    }
    @Test public static void FactoryTest6() {
    	UnitConverter test1 = new PinchToTspConverter();
    	UnitConverter test2 = ConverterFactory.getInstance().create("PinchToTspConverter");
    	assertEquals(test1.convert(value), test2.convert(value), 0.001);
    }
    @Test public static void FactoryTest7() {
    	UnitConverter test1 = new CupToTspConverter();
    	UnitConverter test2 = ConverterFactory.getInstance().create("CupToTspConverter");
    	assertEquals(test1.convert(value), test2.convert(value), 0.001);
    }

	//---------Decorator Test---------//
    // Inversion causes bigger error range
    @Test public static void DecoratorTest1() {
    	// DollarToWon
    	UnitConverter test = new EuroToWonConverter(new DollarToEuroConverter());
    	assertEquals(5525, test.convert(value), 0.1);
    }
    @Test public static void DecoratorTest2() {
    	// WonToEuro
    	UnitConverter test = new DollarToEuroConverter(new InversionDecorator(new DollarToWonConverter()));
    	assertEquals(2, test.convert(2600), 0.1);
    }
    @Test public static void DecoratorTest3() {
    	// TspToCup
    	UnitConverter test = new InversionDecorator(new CupToTspConverter());
    	assertEquals(1, test.convert(48), 0.1);
    }
    @Test public static void DecoratorTest4() {
    	// TspToPinch
    	UnitConverter test = new InversionDecorator(new PinchToTspConverter());
    	assertEquals(40, test.convert(value), 0.1);
    }    
}
