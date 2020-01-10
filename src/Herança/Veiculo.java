package Herança;

public class Veiculo {
	
	private String modelo;
	private float velocidade;
	private int passageiros;
	private float combustivel;
	private boolean isLigado;


	
	public Veiculo(String modelo , float velocidade , int passageiros , float combustivel, boolean isLigado){
		
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.passageiros = passageiros;
		this.combustivel = combustivel;
		this.isLigado = false;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public float getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(float combustivel) {
		this.combustivel = combustivel;
	}
	
	public boolean isLigado() {
		return isLigado;
	}
	
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	public void abastecer(int lts) {
		this.combustivel += lts;
		
	}
	public void acelerar() {
		if(this.isLigado == true) {
			this.velocidade += 20;
			this.combustivel -= 2;
		}else {
			System.out.println("Não é possivel acelerar com o carro desligado.");
		}
	}
	
	public void status() {
		System.out.println("Modelo: " + this.modelo +
				"\nVelocidade: " + this.velocidade +
				"\nPassageiros: " + this.passageiros + 
				"\nCombustivel: "+ this.combustivel);
	}
	
	

	
}
