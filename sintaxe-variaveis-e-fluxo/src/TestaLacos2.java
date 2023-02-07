
public class TestaLacos2 {

	public static void main(String[] args) {
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				if(coluna > linha) {
					break; //o break sai do laço mais interno, de onde ele está
				}
				System.out.print("*");
			}
			System.out.println();
		}
		//também pode estar escrito for(int coluna = 0; coluna <= linha; coluna++) {, indicando que o * pode aparecer, desde que
		//seja equivalente à coluna e linha
	}
}
