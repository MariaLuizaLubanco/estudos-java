
//Assim como quando herdamos uma classe devemos escrever extends, quando fazemos referência a uma interface, escrevemos implements
//É preciso implementar os dois métodos (setSenha e autentica) da interface FuncionarioAutenticavel

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
