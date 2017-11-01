import TinyTestJ.Test;
import static TinyTestJ.Assert.*;

public class TestSuite {
  @Test public static void DETest1() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(10000);
    assertEquals(8500,result,0.001);
  }
  @Test public static void DETest2() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(-1);
    assertEquals(-0.85,result,0.001);
  }
  @Test public static void DETest3() {
	  UnitConverter test = new DollarToEuroConverter();
	  double result = test.convert(1000);
	  assertEquals(850,result,0.001);
  }
    @Test public static void DETest4() {
        UnitConverter test = new DollarToWonConverter();
        double result = test.convert(10000);
        assertEquals(11125702.31, result, 0.001);
    }
    @Test public static void DETest5() {
        UnitConverter test = new DollarToWonConverter();
        double result = test.convert(-1);
        assertEquals(-1112.59, result, 0.001);
    }
    @Test public static void DETest6() {
        UnitConverter test = new DollarToWonConverter();
        double result = test.convert(1000);
        assertEquals(1112558.72, result, 0.001);
    }
    @Test public static void DETest7() {
        UnitConverter test = new EuroToWonConverter();
        double result = test.convert(10000);
        assertEquals(12921518.33, result, 0.001);
    }
    @Test public static void DETest8() {
        UnitConverter test = new EuroToWonConverter();
        double result = test.convert(-1);
        assertEquals(-1292.15, result, 0.001);
    }
    @Test public static void DETest9() {
        UnitConverter test = new EuroToWonConverter();
        double result = test.convert(1000);
        assertEquals(1292008.26, result, 0.001);
    }
    @Test public static void DETest10() {
        UnitConverter test = new CelciusToFahrenheitConverter();
        double result = test.convert(100);
        assertEquals(212, result, 0.001);
    }
    @Test public static void DETest11() {
        UnitConverter test = new CelciusToFahrenheitConverter();
        double result = test.convert(10000);
        assertEquals(18032, result, 0.001);
    }
    @Test public static void DETest12() {
        UnitConverter test = new CelciusToFahrenheitConverter();
        double result = test.convert(-50);
        assertEquals(-58, result, 0.001);
    }
    @Test public static void DETest13() {
        UnitConverter test = new FahrenheitToKelvinConverter();
        double result = test.convert(100);
        assertEquals(310.93, result, 0.001);
    }
    @Test public static void DETest14() {
        UnitConverter test = new FahrenheitToKelvinConverter();
        double result = test.convert(10000);
        assertEquals(5810.93, result, 0.001);
    }
    @Test public static void DETest15() {
        UnitConverter test = new FahrenheitToKelvinConverter();
        double result = test.convert(-50);
        assertEquals(227.59, result, 0.001);
    }
    @Test public static void DETest16() {
        UnitConverter test = new PinchToTspConverter();
        double result = test.convert(100);
        assertEquals(6.25, result, 0.001);
    }
    @Test public static void DETest17() {
        UnitConverter test = new PinchToTspConverter();
        double result = test.convert(10000);
        assertEquals(625, result, 0.001);
    }
    @Test public static void DETest18() {
        UnitConverter test = new PinchToTspConverter();
        double result = test.convert(-10);
        assertEquals(-0.625, result, 0.001);
    }
    @Test public static void DETest19() {
        UnitConverter test = new CupToTspConverter();
        double result = test.convert(100);
        assertEquals(4800, result, 0.001);
    }
    @Test public static void DETest20() {
        UnitConverter test = new CupToTspConverter();
        double result = test.convert(10000);
        assertEquals(480000, result, 0.001);
    }
    @Test public static void DETest21() {
        UnitConverter test = new CupToTspConverter();
        double result = test.convert(-10);
        assertEquals(-480, result, 0.001);
    }
}
