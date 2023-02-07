
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; //o tipo da variável precisa ser igual ao nome da classe criada, que no caso é Cliente
	private static int total; //diferente dos atributos anteriores, não é uma estância, mas sim, um atributo estático
	//compartilhado entre todos os objetos, ele é pertencente a classe conta, e não de cada objeto conta. Static quer dizer "da classe"
	
	
	public Conta(int agencia, int numero) { //isto é um construtor!
		Conta.total++; //quando é static, deve-se colocar Conta. antes, assim como no sysout abaixo (é com letra maiúscula por ser classe)
		System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
	}
	
	
	public void deposita(double valor) { //void no começo é usado para quando você não quer devolver/retornar uma mensagem para o 
		//usuário depois da função
		this.saldo += valor; // pode escrever this.saldo = this.saldo + valor; //dessa forma, altera-se o valor do atributo saldo. 
		//O this usa o método para esta conta (seu uso é opcional
	}
	
	public boolean saca(double valor) { //boolean é para devolver uma mensagem depois de sacar
		if(this.saldo >= valor) {
			this.saldo -= valor; // pode escrever this.saldo = this.saldo - valor;
			return true; //returne é uma palavra chave que para a execução do método e retorna para quem está chamando, retornando ao valor
		} else {
			return false;
		}
		}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}	
		}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		if(numero <= 0) {
			System.out.println("Erro! Não pode valor menor igual a zero");
			return;
		}
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}
