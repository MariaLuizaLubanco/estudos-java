//Gerente � um Funcionario, Gerente herda da classe Funcionario
public class EditorVideo extends Funcionario { //extends Funcionario � um comando para a casse Gerente herdar tudo o que tem na classe Funcionario
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Editor de V�deo");
		return super.getBonificacao() + 100;
	} 
}
