package orientacaoObjeto;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); /* a vari�vel primeiraConta n�o � uma Conta, mas sim, uma refer�ncia ao objeto do tipo Conta,
		semelhante a uma flecha */
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; /* o = copia e cola o que est� na direita para a esquerda. Contudo, primeiraConta n�o �
		um objeto para ser copiado, e sim uma refer�ncia (flecha), ou seja, resulta em uma refer�ncia igual ao mesmo objeto indicado 
		pela primeiraConta */
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		//Como s� h� um new no c�digo, tamb�m h� apenas um objeto do tipo conta (um objeto referente a primeira conta)
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		System.out.println(primeiraConta.saldo); /* Como h� apenas um objeto (apenas uma conta), s� haver� um saldo para ser apresentado.
		Ao printar primeiraConta.saldo, o qual � uma refer�ncia ao objeto, o mesmo saldo ser� apresentado, pois as refer�ncias (flechas)
		convergem para o mesmo objeto */
		
		if(primeiraConta == segundaConta) {
			System.out.println("S�o a mesm�ssima conta");
		}
		
		System.out.println(primeiraConta); 
		System.out.println(segundaConta); //Nota-se que o valor � igual ao da primeiraConta, pois s�o duas refer�ncias ao mesmo objeto		
	}
}
