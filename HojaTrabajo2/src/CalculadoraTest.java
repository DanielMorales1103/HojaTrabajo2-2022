import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testEvaluate() {
		Calculadora calc = new Calculadora();
		int resultado = calc.Evaluate("6 2 /");
		assertEquals(3, resultado);
	}

}
