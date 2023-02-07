
public class TestaReferencias {

	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente(); //forma genérica para se escrever (todo gerente é um funcionário, mas o contrário não é válido
		
		g1.setNome("Malu");
		String nome = g1.getNome();
		
		// g1.autentica(2222); não compila porque o g1 foi criado como funcionário, é não há o método autentica na classe FuncionarioS
		
		System.out.println(nome);

		//duas ou mais formas de referências de tipos diferentes (Gerente e Funcionario) constitui um polimorfismo
	}

}
