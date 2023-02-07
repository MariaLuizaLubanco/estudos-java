
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; //o tipo da vari�vel precisa ser igual ao nome da classe criada, que no caso � Cliente
	private static int total; //diferente dos atributos anteriores, n�o � uma est�ncia, mas sim, um atributo est�tico
	//compartilhado entre todos os objetos, ele � pertencente a classe conta, e n�o de cada objeto conta. Static quer dizer "da classe"
	
	
	public Conta(int agencia, int numero) { //isto � um construtor!
		Conta.total++; //quando � static, deve-se colocar Conta. antes, assim como no sysout abaixo (� com letra mai�scula por ser classe)
		System.out.println("O total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
	}
	
	
	public void deposita(double valor) { //void no come�o � usado para quando voc� n�o quer devolver/retornar uma mensagem para o 
		//usu�rio depois da fun��o
		this.saldo += valor; // pode escrever this.saldo = this.saldo + valor; //dessa forma, altera-se o valor do atributo saldo. 
		//O this usa o m�todo para esta conta (seu uso � opcional
	}
	
	public boolean saca(double valor) { //boolean � para devolver uma mensagem depois de sacar
		if(this.saldo >= valor) {
			this.saldo -= valor; // pode escrever this.saldo = this.saldo - valor;
			return true; //returne � uma palavra chave que para a execu��o do m�todo e retorna para quem est� chamando, retornando ao valor
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
			System.out.println("Erro! N�o pode valor menor igual a zero");
			return;
		}
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("N�o pode valor menor igual a 0");
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
