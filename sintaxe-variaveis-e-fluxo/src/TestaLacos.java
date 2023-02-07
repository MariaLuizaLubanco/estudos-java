
public class TestaLacos {

	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for(int contador = 0; contador <= 10; contador++) {
				System.out.print(multiplicador * contador);//até aqui, formará apenas uma lista 
				System.out.print(" ");//até aqui, formará uma linha com espaço
			}
			System.out.println();//ao pular uma linha no final do laço, cada vez que for formado um novo laço, ou seja, 
			//passar para o próximo multiplicador que irá agir sobre o contador, um espaço será formado, organizando a tabela
		}
	}
}
