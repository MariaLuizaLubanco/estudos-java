
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 21;
		int quantidadePessoas = 3;
		
		//boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado; /*a vari�vel precisa ser declarada antes do if, pois ela morre com o fechar das chaves, n�o sendo 
		equivalente nas linhas seguintes */
		if (quantidadePessoas >= 2) {
			 acompanhado = true;
		} else {
			 acompanhado = false;
		} 
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado == true) { 
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente, voc� n�o pode entrar");
		
		}
	}
	
	
}

