
public class TestaFuncionario {

	public static void main(String [] args) {
		
	    Funcionario malu = new Gerente(); //vale lembrar que malu é a referência, por isso precisamos dar nome, cpf...
		malu.setNome("Malu Lubanco"); //como nome e cpf são Strings, precisa colocar entre "", enquanto salario, por ser double, não precisa
		malu.setCpf("123456"); 
		malu.setSalario(5500);
		
		System.out.println(malu.getNome());
		System.out.println(malu.getBonificacao());
		
	}
}
