
public class TesteIR {

	    public static void main(String[] args) {

	        double salario = 3300.0;
	        double deducao;
	        
	        
	        if (salario >= 1900.0 && salario < 2800.0 ) {
	        	deducao = 142;
		        System.out.println("A dedução de seu salário será de R$" + deducao);
	        } else {
	        	if (salario >= 2800.0 && salario < 3751.0) {
	        		deducao = 350;
	    	        System.out.println("A dedução de seu salário será de R$" + deducao);
	        	} else {
	        		if (salario >= 3751.0 && salario < 4664.0) {
	        			deducao = 636;
	        	        System.out.println("A dedução de seu salário será de R$" + deducao);
	        		}
	        	}
   	        }      
	    }
}

