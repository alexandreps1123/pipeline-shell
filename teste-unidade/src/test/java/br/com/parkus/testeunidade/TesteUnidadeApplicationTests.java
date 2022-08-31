package br.com.parkus.testeunidade;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TesteUnidadeApplicationTests {

	@Test
	void testandoCpfValido() {
		var valido = ValidadorCpf.validar("511.030.530-78");
		assertEquals(true, valido);
	}

	@Test
	void testandoCpfInvalido() {
		var invalido = ValidadorCpf.validar("511.030.530-11");
		assertEquals(false, invalido);
	}

}
