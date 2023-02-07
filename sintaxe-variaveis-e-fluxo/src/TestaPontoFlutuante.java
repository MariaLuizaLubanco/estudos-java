//ponto flutuante � o decimal
public class TestaPontoFlutuante {

		public static void main(String[] args) {
			
			double salario; //no double, cabe vari�veis do tipo inteiro, mas o contr�rio n�o � v�lido.
			salario = 1250.70; //decimal no java � com ponto e n�o v�rgula!
			System.out.println("Meu sal�rio � " + salario);
			
			double divisao = 3.14 / 2; /*a partir de agora, n�o preciso declarar e iniciar a vari�vel em momentos diferentes, basta 
			fazer de uma vez --> double divisao = ***;   a vari�vel � v�lida desde quando � declarada at� o fechamento da chave*/
			System.out.println(divisao);
			
			int outraDivisao = 5 / 2;
			System.out.println(outraDivisao);
			//como os n�meros que est�o sendo divididos s�o inteiros, o java far� a divis�o, mas tornar� a resposta em um tipo inteiro
			
			double novaTentativa = 5 / 2;
			System.out.println(novaTentativa);
			/*o java l� da direita para a esquerda, ou seja, primeiro 5 / 2. Como ambos s�o n�meros inteiros, ele segue o princ�pio
			da outraDivisao, sendo o resultado igual a 2. Depois disso, ele ler� a parte esquerda, na qual exige que o resultado seja
			em double (com decimal). Dessa forma, ele transformar� o resultado j� obtido da equa��o com n�meros inteiros, e
			transformar� em um n�mero decimal, adicionando o ponto e o n�mero zero, formando 2.0 */
			
			double tentativaDivisao = 5.0 / 2;
			System.out.println(tentativaDivisao);
			/*para resolver o problema anterior, fazendo com que o java apresente o resultado correto da divis�o, basta tornar um 
			dos n�meros da divis�o em um n�mero decimal, sendo um double dividido por um inteiro, sendo a resposta um ponto flutuante */
		}
}
