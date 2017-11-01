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
	  double result = test.convert(558);
	  assertEquals(474.3,result,0.001);
  }
    @Test public static void DETest4() {
        UnitConverter test = new DollarToWonConverter();
        double result = test.convert(10000);
        assertEquals(11160000, result, 0.001);
    }
    @Test public static void DETest5() {
        UnitConverter test = new DollarToWonConverter();
        double result = test.convert(-1);
        assertEquals(-1116, result, 0.001);
    }
    @Test public static void DETest6() {
        UnitConverter test = new DollarToWonConverter();
        double result = test.convert(0.74);
        assertEquals(825.84, result, 0.001);
    }
    @Test public static void DETest7() {
        UnitConverter test = new EuroToWonConverter();
        double result = test.convert(10000);
        assertEquals(13000000, result, 0.001);
    }
    @Test public static void DETest8() {
        UnitConverter test = new EuroToWonConverter();
        double result = test.convert(-100);
        assertEquals(-130000, result, 0.001);
    }
    @Test public static void DETest9() {
        UnitConverter test = new EuroToWonConverter();
        double result = test.convert(50);
        assertEquals(65000, result, 0.001);
    }
    @Test public static void DETest10() {
        UnitConverter test = new CelciusToFahrenheitConverter();
        double result = test.convert(100);
        assertEquals(212, result, 0.001);
    }
    @Test public static void DETest11() {
        UnitConverter test = new CelciusToFahrenheitConverter();
        double result = test.convert(9);
        assertEquals(48.2, result, 0.001);
    }
    @Test public static void DETest12() {
        UnitConverter test = new CelciusToFahrenheitConverter();
        double result = test.convert(-50);
        assertEquals(-58, result, 0.001);
    }
    @Test public static void DETest13() {
        UnitConverter test = new FahrenheitToKelvinConverter();
        double result = test.convert(100);
        assertEquals(310.927, result, 0.001);
    }
    @Test public static void DETest14() {
        UnitConverter test = new FahrenheitToKelvinConverter();
        double result = test.convert(92);
        assertEquals(306.483, result, 0.001);
    }
    @Test public static void DETest15() {
        UnitConverter test = new FahrenheitToKelvinConverter();
        double result = test.convert(-50);
        assertEquals(227.594, result, 0.001);
    }
    @Test public static void DETest16() {
        UnitConverter test = new PinchToTspConverter();
        double result = test.convert(100);
        assertEquals(12.5, result, 0.001);
    }
    @Test public static void DETest17() {
        UnitConverter test = new PinchToTspConverter();
        double result = test.convert(1);
        assertEquals(0.125, result, 0.001);
    }
    @Test public static void DETest18() {
        UnitConverter test = new PinchToTspConverter();
        double result = test.convert(-55);
        assertEquals(-6.875, result, 0.001);
    }
    @Test public static void DETest19() {
        UnitConverter test = new CupToTbspConverter();
        double result = test.convert(100);
        assertEquals(1600, result, 0.001);
    }
    @Test public static void DETest20() {
        UnitConverter test = new CupToTbspConverter();
        double result = test.convert(14);
        assertEquals(224, result, 0.001);
    }
    @Test public static void DETest21() {
        UnitConverter test = new CupToTbspConverter();
        double result = test.convert(-10);
        assertEquals(-160, result, 0.001);
    }
}
