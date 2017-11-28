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
        assertEquals(Double.POSITIVE_INFINITY, result, 0.001);
    }
    @Test public static void DETest14() {
        UnitConverter test = new FahrenheitToKelvinConverter();
        double result = test.convert(92);
        assertEquals(306.483, result, 0.001);
    }
    @Test public static void DETest15() {
        UnitConverter test = new FahrenheitToKelvinConverter();
        double result = test.convert(Double.MIN_VALUE);
        assertEquals(255.372, result, 0.001);
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
        UnitConverter test = new CupToTbspConverter();
        double result = test.convert(Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.001);
    }
    @Test public static void DETest20() {
        UnitConverter test = new CupToTbspConverter();
        double result = test.convert(14);
        assertEquals(224, result, 0.001);
    }
    @Test public static void DETest21() {
        UnitConverter test = new CupToTbspConverter();
        double result = test.convert(Double.MIN_VALUE);
        assertEquals(7.9E-323, result, 0.001);
    }
}
