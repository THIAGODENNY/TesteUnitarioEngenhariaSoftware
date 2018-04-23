
public class ExecutaFatorial {
	
	public static void main(String[] args){
		
		Fatorial fatorial = new Fatorial();
		
		int numeroParaFatorial = 5;
		int respostaEsperadaNumeroParaFatorial = 120;
		
		int calculoFatorial = fatorial.calculaFatorial(numeroParaFatorial);
		
		System.out.println(calculoFatorial);
	}

}
