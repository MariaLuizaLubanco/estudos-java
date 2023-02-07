package orientacaoObjeto;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); /* a variável primeiraConta não é uma Conta, mas sim, uma referência ao objeto do tipo Conta,
		semelhante a uma flecha */
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; /* o = copia e cola o que está na direita para a esquerda. Contudo, primeiraConta não é
		um objeto para ser copiado, e sim uma referência (flecha), ou seja, resulta em uma referência igual ao mesmo objeto indicado 
		pela primeiraConta */
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		//Como só há um new no código, também há apenas um objeto do tipo conta (um objeto referente a primeira conta)
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		System.out.println(primeiraConta.saldo); /* Como há apenas um objeto (apenas uma conta), só haverá um saldo para ser apresentado.
		Ao printar primeiraConta.saldo, o qual é uma referência ao objeto, o mesmo saldo será apresentado, pois as referências (flechas)
		convergem para o mesmo objeto */
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesmíssima conta");
		}
		
		System.out.println(primeiraConta); 
		System.out.println(segundaConta); //Nota-se que o valor é igual ao da primeiraConta, pois são duas referências ao mesmo objeto		
	}
}
