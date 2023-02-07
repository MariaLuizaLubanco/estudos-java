package orientacaoObjeto;

public class TestaMetodo {

	public static void main(String [] args) {
		Conta contaDaMalu = new Conta();
		contaDaMalu.saldo = 100;
		contaDaMalu.deposita(50); //para invocar m�todos, n�o se utiliza =, como nos atributos, mas sim, ()
		System.out.println(contaDaMalu.saldo);
		
		boolean conseguiuRetirar = contaDaMalu.saca(20);
		System.out.println(contaDaMalu.saldo);
		System.out.println(conseguiuRetirar); //o uso do retorno do m�todo fica a crit�rio
		
		Conta contaDoLeo = new Conta();
		contaDoLeo.deposita(1000);
		
		if(contaDoLeo.transfere(300, contaDaMalu)) {
			System.out.println("Transfer�ncia realizada com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDoLeo.saldo);
		System.out.println(contaDaMalu.saldo);
		
		contaDaMalu.titular = "Malu Lubanco";
		System.out.println(contaDaMalu.titular);
	}
}
