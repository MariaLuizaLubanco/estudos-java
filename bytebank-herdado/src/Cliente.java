
//Assim como quando herdamos uma classe devemos escrever extends, quando fazemos refer�ncia a uma interface, escrevemos implements
//� preciso implementar os dois m�todos (setSenha e autentica) da interface FuncionarioAutenticavel

public class Cliente implements FuncionarioAutenticavel {

	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}
 	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
