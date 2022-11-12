package Escola;

public class Aluno {
	private int matricula;
	private String nome;
	private double c1;
	private double c2;
	private double c3;
	private double media;
	
	public Aluno(int matricula, String nome, double c1, double c2, double c3) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.media = (this.c1+this.c2+this.c3)/3;
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
	
	
}
