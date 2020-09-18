package Entidade;

public class Preguica extends Animal {
	
	private String subirArvores;

	public Preguica(String nome, int idade, String som, String subirArvores) 
	{
		super(nome, idade, som);
		this.subirArvores = subirArvores;
	}

	public String getSubirArvores() {
		return subirArvores;
	}

	public void setSubirArvores(String subirArvores) {
		this.subirArvores = subirArvores;
	}
	
	
	
	
	
}
