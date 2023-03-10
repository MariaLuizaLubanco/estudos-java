//Gerente ? um Funcionario, Gerente herda da classe Funcionario, assina o contrato FuncionarioAutenticavel
public class Gerente extends Funcionario implements FuncionarioAutenticavel { //extends Funcionario ? um comando para a casse Gerente herdar tudo o que tem na classe Funcionario
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	//public double getBonificacao() {
		//System.out.println("Chamando m?todo de bonificacao do gerente");
		//return super.getSalario();
		//return super.getBonificacao() + super.getSalario(); //a necessidade de escrever super. antes do sal?rio ? para indicar que o sal?rio
		//n?o ? desta classe, ou seja, n?o ? this.salario, mas sim, da classe super/classe m?e (esse atributo ? proveniente da classe
		//Funcionario.
		//Ao escrever super.getBonificacao() + super.getSalario(), estamos fazendo refer?ncia ? bonifica??o da classe Funcion?rio e somando
		//com o valor do salario do gerente (o super do salario ? para fazer refer?ncia ao atributo herdado da classe Funcion?rio, mas 
		//como est? sendo escrito nesta classe, ? o sal?rio do gerente que aparecer?. ? importante fazer essa distin??o, pois a bonifi
		//ca??o ? diferente para funcion?rios e gerentes. Caso escrevesse return (this.salario * 0.1) + super.getSalario() nesta classe e 
		//houvesse uma altera??o na bonifica??o da classe Funcion?rio, indo, por exemplo, para 5%, n?o seria atualizado aqui, pois o
		//c?digo foi reescrito.
	

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
