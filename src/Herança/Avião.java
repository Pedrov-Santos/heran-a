package Herança;

public class Avião extends Veiculo {
	
	private String tipo;
	private String uso;

	
	public Avião(String modelo, float velocidade, int passageiros, float combustivel, String tipo, String uso, boolean isLigado) {
		super(modelo, velocidade, passageiros, combustivel, isLigado);
		
		this.tipo = tipo;
		this.uso = uso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}
	public void abastecer(String lts) {
		super.abastecer(Integer.parseInt(lts));
	}
	
	public void status() {
		super.status();
		
		System.out.println("Tipo: " + this.tipo +
				"\nUso: " + this.uso);
	}

}
