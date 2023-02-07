
public class TestaGerente {

	public static void main(String [] args) {
		
		FuncionarioAutenticavel referencia = new Gerente(); //o mesmo c�digo � v�lido para administrador e cliente
	  //FuncionarioAutenticavel referencia = new Administrador();
	  //FuncionarioAutenticavel referencia = new Cliente();

		
		Gerente g1 = new Gerente();
		g1.setNome("Malu"); //esses 3 m�todos s�o herdados da classe Funcionario
		g1.setCpf("2141652");
		g1.setSalario(5000);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222); //com esta linha, a senha abaixo � true, pois n�s a alteramos antes
		boolean autenticou = g1.autentica(2222); //o m�todo autentica vem da classe Gerente
		
		System.out.println(autenticou); //retornar� false porque n�o � a senha correta, como descrita na classe Gerente (quando n�o
		//� dado um valor para o atributo, ent�o ele ser� 0. Caso queira deixar uma senha espec�fica, basta voltar na classe Gerente
		//e escrever, por exemplo, private int senha = 123; CORRE��O: COMO FOI ATRIBUIDO O VALOR 2222 A SENHA, SER� TRUE PARA AUTENTICACAO
		
		System.out.println(g1.getBonificacao());
		
	}
}
