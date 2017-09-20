package br.unincor.model;

public class Pokemon {
	
	private String nome; //Nome do pokemon - sem validação
	private String tipo; //Tipo do pokemon - sem validação
	private Double peso; //Peso do pokemon - deve ser um valor positivo
	private Double altura; //Altura do pokemon - deve ser um valor positivo
	private Long cp; //Pontos de combate - deve ser um valor positivo
	
	public Pokemon(String nome, String tipo, Double peso, Double altura,Long cp) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		if(peso>1)
		  this.peso = peso;
		else 
			this.peso=1d;
		if(altura>1)
		this.altura = altura;
		else
			this.altura=1d;
		if(cp>1)
		 this.cp = cp;
		else
			this.cp=1L;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		if (peso>1)
			this.peso = peso;
		else
			this.peso = 1D;

	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		if (altura>1)
		  this.altura = altura;
		else
			this.altura=1D;
	}
	public Long getCp() {
		return cp;
	}
	public void setCp(Long cp) {
		if(cp>1)
		this.cp = cp;
		else
			this.cp=1L;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Long cp() {
		Double cp = (Math.random()*90)+10;
		return cp.longValue();
	}
	@Override
	public String toString() {
		return "Pokemon [nome=" + nome + ", tipo=" + tipo + ", peso=" + peso + ", altura=" + altura + ", cp=" + cp
				+ "]";
	}

	/** Implementar este método para retornar os dados do pokemon **/
	public String verDados() {
		return "";
	}
}
