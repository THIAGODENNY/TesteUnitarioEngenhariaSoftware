
public class Fatorial {
	
	int calculaFatorial(int numero){
		
		int iInicial = numero;
		
		for(int i = (numero - 1) ;i >= 1;i--){
			iInicial *= i;
		}
		return iInicial;
		
		//falhar teste unitario
		/*for(int i = (numero - 1) ;i <= 1;i--){
			iInicial *= i;
		}
		return iInicial;
		*/
	}

}
