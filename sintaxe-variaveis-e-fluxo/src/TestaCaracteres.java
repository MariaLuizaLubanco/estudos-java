
public class TestaCaracteres {

	public static void main(String[] args) {
		char letra = 'a'; //char é válido para um único caracter e aspas simples
		System.out.println(letra);
		
		char valor = 66; //char é uma variável numérica do tipo inteiro e short (pequeno)
		System.out.println(valor); //o número na tabela unicode terá uma letra
		
		valor = (char) (valor + 1); /*se escrever valor = valor + 1, não irá compilar, pois o java dá a resposta na maior variável. Neste caso,
		a maior é do tipo inteiro, devido ao 1 ser um int. Um char cabe em um inteiro, mas um inteiro não cabe em um char. Por isso é importante
		usar o (char), e o valor + 1 precisa ficar entre parêntese por ser uma soma */
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia"; //String é mais utilizada do que o char
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra); //String não é do tipo int, double ou os que já vimos. Aparece muito!
	}
}
