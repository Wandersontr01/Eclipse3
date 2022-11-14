package Escola2;

public class Materia {
	private String nome;
	private String Professor;
	
	public Materia(String nome, String professor) {
		this.nome = nome;
		this.Professor = professor;
	}

	public String getNome() {
		return nome;
	}
	public String getProfessor() {
		return Professor;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setProfessor(String professor) {
		Professor = professor;
	}
	
	
	
}
