
public class ContaCorrente extends Conta { //n�o � herdado construtores, pois eles s�o da classe e n�o s�o herdados para os filhos
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
		
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
		
	}
}
