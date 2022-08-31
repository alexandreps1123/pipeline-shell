package br.com.parkus.testeunidade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteUnidadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteUnidade.class, args);

		Scanner teclado = new Scanner(System.in);
		String cpf = teclado.nextLine();

		System.out.println("O cpd digitado é:" +
			(ValidadorCpf.validar(cpf) ? "válido" : "inválido") );
	}

}
