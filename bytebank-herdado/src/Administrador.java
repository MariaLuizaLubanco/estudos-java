
public class Administrador extends Funcionario implements FuncionarioAutenticavel {

	private AutenticacaoUtil autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		return 50;
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
