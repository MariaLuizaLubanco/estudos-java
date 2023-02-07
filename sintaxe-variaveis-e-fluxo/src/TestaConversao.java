
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int)salario; //adicionando o (int), entende-se que o que est� a frente, ser� transformado em inteiro
		System.out.println(valor);
		
		long numeroGrande = 312165445; //caso passe o limite do long, adiciona-se o "L" no final, por exemplo 1741454668L
		short valorPequeno = 2131;
		byte b = 127;
		float pontoFlutuante = 3.14f; /*usa-se o f no final para indicar que o n�mero � um float, porque o tamanho dele corresponde 
		a um double, dando erro na leitura. Tamb�m pode ser escrito (float)3.14, ambos for�am o valor a se tornar um float */
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}
}
