package challenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PowTest {

	Pow p = new Pow();

	@Test
	@DisplayName("Teste sumIntDigits")
	void testSumIntDigits() {
		assertEquals(15, p.sumIntDigits(12345));
	}

	@Test
	@DisplayName("Teste powSolver")
	void testPowSolver() {
		assertEquals("9", p.powSolver(3, 2));

	}

	@Test
	@DisplayName("Teste stringSum")
	void testStringSum() {
		assertEquals(15, p.stringSum("12345"));

	}

	@Test
	@DisplayName("Teste integrado")
	void testIntegrado() {
		assertEquals(9, p.sumIntDigits(p.stringSum(new String(p.powSolver(3, 3)))));
		assertEquals(8, p.sumIntDigits(p.stringSum(new String(p.powSolver(2, 3)))));
		assertEquals(1, p.sumIntDigits(p.stringSum(new String(p.powSolver(1, 0)))));

	}

}
