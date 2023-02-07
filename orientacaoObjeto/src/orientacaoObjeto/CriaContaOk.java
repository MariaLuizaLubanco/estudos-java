package orientacaoObjeto;

public class CriaContaOk {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); //o primeiro Conta é a nossa referência, tornando-se uma variável. É oriunda da classe 
		//Conta.java, enquanto o new cria o objeto
		primeiraConta.saldo = 200; //o ponto simboliza o direcionamento do cógido para o objeto, ele faz referência do objeto ao
		//código
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Segunda conta tem " + segundaConta.saldo);
	
		System.out.println(primeiraConta.agencia); //o valor padrão dos atributos é zerado, quando não inserido nada. Mas pode-se 
		//alterar o valor padrão para diferente de zero, desde que a alteração seja feita nos atributos da classe Conta.java. Isso
		//significa que se a pessoa esquecer de informar um dado, como o número da agência, o valor que aparecerá será o valor padrão
		//(zero, caso você não tenha determinado outro valor)
		//OBS: a alteração, quando feita na classe Conta.java, será em todos os objetos, a nao ser que seja feita no objeto em si
		segundaConta.agencia = 146;
		System.out.println("A agência da segunda conta é " + segundaConta.agencia);
		
		System.out.println(primeiraConta.numero);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesmíssima conta");
		} else {
			System.out.println("As contas são diferentes");
		}
		
		
		System.out.println(primeiraConta); 
		System.out.println(segundaConta); //A referência da segundaConta é diferente da primeiraConta, pois são para objetos diferentes
		
	}
}
