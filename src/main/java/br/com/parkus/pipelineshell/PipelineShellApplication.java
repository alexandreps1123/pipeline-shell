package br.com.parkus.pipelineshell;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PipelineShellApplication {

	public static void main(String[] args) {
		SpringApplication.run(PipelineShellApplication.class, args);

		Scanner teclado = new Scanner(System.in);
		String cpf = teclado.nextLine();

		System.out.println("O cpd digitado é:" +
			(ValidadorCpf.validar(cpf) ? "válido" : "inválido") );
	}

}
