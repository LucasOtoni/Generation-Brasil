package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade1") //Quando digitar no navegador essa classe deve responder ao meu navegador o endereço digitado
public class HelloController {
	
	@GetMapping //responder requisião do tipo Mapping, requisição de consulta
	public String MentalidadeHabilidade() {
		return "Mentalidade: Responsabilidade Pessoal | Habilidade: Atenção aos Detalhes"; //Metodo do tipo String que Retorna o valor da String
	}
	
	@RequestMapping("/atividade2") //Criando uma ramificação dentro do primeiro caminho, ou seja, mais um caminho "/atividade1/atividade2 para retornar mais uma String
	public String retornaObjetivos() {
		return "Tenho o objetivo de continuar aumentando a minha porcentagem de aproveitamento do bootcamp"
				+ ", fazer alguns cursos do Alura e Udemy dentro do que estou aprendendo e alguns"
				+ " exercícios extras para fixar o aprendizado. Entrar menos em pânico como no primeiro bloco e"
				+ " focar em encontrar soluções para as minhas dificuldades. ";
	}
	
}



