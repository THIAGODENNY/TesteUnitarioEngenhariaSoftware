
public class Cliente {
	
	private String nome;
	private double saldo;
	
	Cliente(String nome,double saldo){
		this.nome = nome;
		this.saldo = saldo;
	}
	
	void Transfere(Cliente cliente, double valor){
		cliente.saldo += valor;
		this.saldo -= valor;		
	}
	
	double getSaldo(){
		return this.saldo;
	}
}
