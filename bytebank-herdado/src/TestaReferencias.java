
public class TestaReferencias {

	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente(); //forma gen�rica para se escrever (todo gerente � um funcion�rio, mas o contr�rio n�o � v�lido
		
		g1.setNome("Malu");
		String nome = g1.getNome();
		
		// g1.autentica(2222); n�o compila porque o g1 foi criado como funcion�rio, � n�o h� o m�todo autentica na classe FuncionarioS
		
		System.out.println(nome);

		//duas ou mais formas de refer�ncias de tipos diferentes (Gerente e Funcionario) constitui um polimorfismo
	}

}
