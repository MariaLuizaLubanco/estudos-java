
public class TestaLacos {

	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for(int contador = 0; contador <= 10; contador++) {
				System.out.print(multiplicador * contador);//at� aqui, formar� apenas uma lista 
				System.out.print(" ");//at� aqui, formar� uma linha com espa�o
			}
			System.out.println();//ao pular uma linha no final do la�o, cada vez que for formado um novo la�o, ou seja, 
			//passar para o pr�ximo multiplicador que ir� agir sobre o contador, um espa�o ser� formado, organizando a tabela
		}
	}
}
