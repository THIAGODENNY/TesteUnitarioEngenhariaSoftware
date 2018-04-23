import org.junit.Test;

import junit.framework.Assert;


public class ExecutaFatorialTeste {
	
	@Test
	public void main(){
		
		Fatorial fatorial = new Fatorial();
		
		int numeroParaFatorial = 5;
		int respostaEsperadaNumeroParaFatorial = 120;
		
		int calculoFatorial = fatorial.calculaFatorial(numeroParaFatorial);
		
		System.out.println(calculoFatorial);
		
		Assert.assertEquals(respostaEsperadaNumeroParaFatorial, calculoFatorial, 0.00001);
		
		
	}

}
