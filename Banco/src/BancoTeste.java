import junit.framework.Assert;

import org.junit.Test;


public class BancoTeste {
	
	@Test
	public void main(){
		
		
		//cenario
		Cliente vanessa = new Cliente("Vanessa",1000);
		Cliente thiago = new Cliente("Thiago",2000);
		
		//acao
		vanessa.Transfere(thiago, 100);
		
		
		//validacao
		
		double valorThiagoEsperado = 2100;
		double valorVanessaEsperado = 900;
		
		System.out.println(vanessa.getSaldo());
		System.out.println(thiago.getSaldo());
		
		//teste unitario
		Assert.assertEquals(valorThiagoEsperado, thiago.getSaldo(), 0.0001);
		Assert.assertEquals(valorVanessaEsperado, vanessa.getSaldo(), 0.0001);
	
		
	}

}
