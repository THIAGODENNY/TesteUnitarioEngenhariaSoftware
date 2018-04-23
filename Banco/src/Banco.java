
public class Banco {
	
	public static void main(String[] args){
		
		
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
		
		
		
	}

}
