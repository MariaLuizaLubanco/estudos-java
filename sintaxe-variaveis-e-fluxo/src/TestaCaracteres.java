
public class TestaCaracteres {

	public static void main(String[] args) {
		char letra = 'a'; //char � v�lido para um �nico caracter e aspas simples
		System.out.println(letra);
		
		char valor = 66; //char � uma vari�vel num�rica do tipo inteiro e short (pequeno)
		System.out.println(valor); //o n�mero na tabela unicode ter� uma letra
		
		valor = (char) (valor + 1); /*se escrever valor = valor + 1, n�o ir� compilar, pois o java d� a resposta na maior vari�vel. Neste caso,
		a maior � do tipo inteiro, devido ao 1 ser um int. Um char cabe em um inteiro, mas um inteiro n�o cabe em um char. Por isso � importante
		usar o (char), e o valor + 1 precisa ficar entre par�ntese por ser uma soma */
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia"; //String � mais utilizada do que o char
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra); //String n�o � do tipo int, double ou os que j� vimos. Aparece muito!
	}
}
