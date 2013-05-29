package Calculator;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {
	
	@Test
	public void shouldReturnZeroOnNone() {
		assertEquals(0, Calculator.add());
	}

	@Test
	public void shouldReturnZeroOnEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void shouldReturnZeroOnNull() {
		assertEquals(null, Calculator.add(null));
	}

	@Test
	public void shouldReturnZeroOnTwoNumber() {
		assertEquals(3, Calculator.add("1,2"));
	}
}
