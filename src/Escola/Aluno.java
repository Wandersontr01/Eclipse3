package Escola;

public class Aluno {
	private int matricula;
	private String nome;
	private double c1;
	private double c2;
	private double c3;
	private double media;
	private boolean situacao;

	public Aluno(int matricula, String nome, double c1, double c2, double c3) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.media = (this.c1 + this.c2 + this.c3) / 3;
		if(this.media >= 7) {
			this.situacao = true;
		}else {
			this.situacao = false;
		}
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public double getC1() {
		return c1;
	}

	public double getC2() {
		return c2;
	}

	public double getC3() {
		return c3;
	}

	public double getMedia() {
		return this.media;
	}
	public boolean getSituacao() {
		return this.situacao;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setC1(double c1) {
		this.c1 = c1;
	}

	public void setC2(double c2) {
		this.c2 = c2;
	}

	public void setC3(double c3) {
		this.c3 = c3;
	}
	

	@Override
	public String toString() {
		return "\nAluno: " + nome + "\nMatricula: " + matricula + "\nNota c1: " + c1 + "\nNota c2: " + c2
				+ "\nNota c3: " + c3 + "\nMedia: " + media + "\n";
	}

}
