
public class TestaFuncionario {

	public static void main(String [] args) {
		
	    Funcionario malu = new Gerente(); //vale lembrar que malu � a refer�ncia, por isso precisamos dar nome, cpf...
		malu.setNome("Malu Lubanco"); //como nome e cpf s�o Strings, precisa colocar entre "", enquanto salario, por ser double, n�o precisa
		malu.setCpf("123456"); 
		malu.setSalario(5500);
		
		System.out.println(malu.getNome());
		System.out.println(malu.getBonificacao());
		
	}
}
