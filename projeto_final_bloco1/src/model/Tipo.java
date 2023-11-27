package model;

public abstract class Tipo {
	
	//Atributos
	private String peca;
	private int id, tipo;
	private float valor;
	
	//Método Construtor
	public Tipo(String peca, int id, int tipo, float valor) {
		this.peca = peca;
		this.id = id;
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getPeca() {
		return peca;
	}

	public void setPeca(String peca) {
		this.peca = peca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	//Visualizar()
		public void visualizar() {
			
			String tipo = "";
			
			switch(this.tipo) {
				case 1 -> tipo = "Parte de Cima";
				case 2 -> tipo = "Partde de Baixo";		
			}
			
			System.out.println("\n\n***************************************");
			System.out.println("Informações da Peça");
			System.out.println("***************************************");
			System.out.println("Peça: " + this.peca);
			System.out.println("Tipo: " + tipo);
			System.out.println("Id: " + this.id);
			System.out.println("Valor da Peça: " + this.valor);
		}
	
	

}
