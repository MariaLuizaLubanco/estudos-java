
public class TestaWhile {

	public static void main (String[] args) {
		int contador = 0;
		while(contador <= 10) {
			System.out.println(contador);
			contador = contador + 1; //na verdade, a forma mais comum de se escrever � contador ++; tamb�m existe a forma contador += 1;
		}
		System.out.println(contador);
	}
}

