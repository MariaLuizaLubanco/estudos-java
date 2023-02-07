package orientacaoObjeto;

public class CriaContaOk {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); //o primeiro Conta � a nossa refer�ncia, tornando-se uma vari�vel. � oriunda da classe 
		//Conta.java, enquanto o new cria o objeto
		primeiraConta.saldo = 200; //o ponto simboliza o direcionamento do c�gido para o objeto, ele faz refer�ncia do objeto ao
		//c�digo
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Segunda conta tem " + segundaConta.saldo);
	
		System.out.println(primeiraConta.agencia); //o valor padr�o dos atributos � zerado, quando n�o inserido nada. Mas pode-se 
		//alterar o valor padr�o para diferente de zero, desde que a altera��o seja feita nos atributos da classe Conta.java. Isso
		//significa que se a pessoa esquecer de informar um dado, como o n�mero da ag�ncia, o valor que aparecer� ser� o valor padr�o
		//(zero, caso voc� n�o tenha determinado outro valor)
		//OBS: a altera��o, quando feita na classe Conta.java, ser� em todos os objetos, a nao ser que seja feita no objeto em si
		segundaConta.agencia = 146;
		System.out.println("A ag�ncia da segunda conta � " + segundaConta.agencia);
		
		System.out.println(primeiraConta.numero);
		
		if(primeiraConta == segundaConta) {
			System.out.println("S�o a mesm�ssima conta");
		} else {
			System.out.println("As contas s�o diferentes");
		}
		
		
		System.out.println(primeiraConta); 
		System.out.println(segundaConta); //A refer�ncia da segundaConta � diferente da primeiraConta, pois s�o para objetos diferentes
		
	}
}
