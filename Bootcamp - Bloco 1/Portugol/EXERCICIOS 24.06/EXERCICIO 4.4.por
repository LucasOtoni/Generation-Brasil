programa
{
//número é par ou ímpar, e se é positivo ou negativo.
	
	funcao inicio()
	{
		inteiro numero
		
		escreva("Digite um número ")
		leia(numero)

		se (numero % 2==0){
			escreva("O número informado é par.")
		}
		senao{
			escreva("O número informado é impar.")
		}
			
		se (numero >0){
			escreva("\nEsse número é positivo")
		}
		senao se (numero == 0){
			escreva("\nEsse número é neutro")	
		}
		senao{
			escreva("\nEsse número é negativo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 545; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */