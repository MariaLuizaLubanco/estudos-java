package orientacaoObjeto;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	//essas vari�veis s�o do tipo atributo, n�o est�o dentro do main, mas sim, logo ap�s a classe
	
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
	}


