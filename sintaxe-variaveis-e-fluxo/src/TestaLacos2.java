
public class TestaLacos2 {

	public static void main(String[] args) {
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				if(coluna > linha) {
					break; //o break sai do la�o mais interno, de onde ele est�
				}
				System.out.print("*");
			}
			System.out.println();
		}
		//tamb�m pode estar escrito for(int coluna = 0; coluna <= linha; coluna++) {, indicando que o * pode aparecer, desde que
		//seja equivalente � coluna e linha
	}
}
