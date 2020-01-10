package Herança;

public class Carro extends Veiculo {
	
	private String marca;
	private int portas;
	private int ano;
//	private int setVelocidade;
//	private int setCombustivel;

	
	public Carro(String modelo, float velocidade, int passageiros, float combustivel, String marca, int portas, int ano, boolean isLigado) {
		super(modelo, velocidade, passageiros, combustivel, isLigado);
		
		this.marca = marca;
		this.portas = portas;
		this.ano = ano;
}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void abastecer(int lts) {
		super.abastecer(lts);
	}
	public void acelerar() {
		if(this.isLigado() == true) {
//			this.setVelocidade += 30;
//			this.setCombustivel -= 3;
		}else {
			System.out.println("Não é possivel acelerar com o carro desligado.");
		}
	}
	
	public void status() {
		super.status();
		System.out.println("Marca: " + this.marca + 
				"\nPortas: " + this.portas + 
				"\nAno: " + this.ano);
	}
}