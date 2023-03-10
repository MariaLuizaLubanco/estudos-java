
/*Uma interface ? uma classe abstrata com todos os m?todos abstratos. Ou seja, n?o h? nada concreto. A interface ? um contrato. 
Sendo assim, quem assina esse contrato precisa implementar:
	- m?todo setSenha
	- m?todo autentica
A interface ? como um contrato que define as obriga??es, o que precisa estar nas outras classes. */
public abstract interface FuncionarioAutenticavel { 
	
	public abstract void setSenha(int senha); //abstract nunca pode atribuir algo
	
	public abstract boolean autentica(int senha);
}
