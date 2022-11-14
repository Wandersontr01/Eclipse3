package Escola2;

import java.util.Arrays;

public class vetAluno {
	private Aluno[] vet;
	private int quantAluno;

	public vetAluno(int tam) {
		this.vet = new Aluno[tam];
		this.quantAluno = 0;
	}

	public Aluno[] getVet() {
		return vet;
	}

	public int getQuantAluno() {
		return quantAluno;
	}

	public void setVet(Aluno[] vet) {
		this.vet = vet;
	}

	public void setQuantAluno(int quantAluno) {
		this.quantAluno = quantAluno;
	}

	public boolean cadastrar(Aluno novo) {
		if (this.vet.length == this.quantAluno) {
			return false; // vetor cheio
		} else {
			this.vet[this.quantAluno] = novo;
			this.quantAluno++;
			return true; // sucesso
		}
	}

	public int deletarPorNome(String nome) {
		if (this.quantAluno == 0) {
			return 0; // vetor vazio
		} else {
			for (int c = 0; c < this.quantAluno; c++) {
				if (this.vet[c].getNome().equalsIgnoreCase(nome)) {
					this.vet[c] = this.vet[this.quantAluno - 1];
					return 1;
				}
			}
			return 2; // nome nao encontrado na lista
		}
	}

	public int deletarPorMatricula(int matricula) {
		if (this.quantAluno == 0) {
			return 0; // vetor vazio
		} else {
			for (int c = 0; c < this.quantAluno; c++) {
				if (this.vet[c].getMatricula() == matricula) {
					this.vet[c] = this.vet[this.quantAluno - 1];
					return 1;
				}
			}
			return 2; // nome nao encontrado na lista
		}
	}

	public void mostrarAlunoCadastrado() {
		System.out.println("Nome: " + this.vet[this.quantAluno - 1].getNome());
		System.out.println("Matricula: " + this.vet[this.quantAluno - 1].getMatricula());
	}

	public void mostrarTodos() {
		if (this.quantAluno != 0) {
			System.out.println("\nListagem de Alunos");
			for (int c = 0; c < this.quantAluno; c++) {
				System.out.println("\nNome: " + this.vet[c].getNome());
				System.out.println("Matricula: " + this.vet[c].getMatricula());
				System.out.println("Nota C1: " + this.vet[c].getC1());
				System.out.println("Nota C2: " + this.vet[c].getC2());
				System.out.println("Nota C3: " + this.vet[c].getC3());
				System.out.println("Media: " + this.vet[c].getMedia());
				if(this.vet[c].getSituacao()) {
					System.out.println("Situação: Aprovado!");
				}else {
					System.out.println("Situação: Reprovado!");
				}
			}
		} else {
			System.out.println("Nenhum aluno cadastrado!");
		}
	}

	public void calcularMediaGeral() {
		if (this.quantAluno != 0) {
			double mediaGeral = 0;

			for (int c = 0; c < this.quantAluno; c++) {
				mediaGeral += this.vet[c].getMedia();
			}
			System.out.println("A media Geral é: " + (mediaGeral /= (this.quantAluno)));
		} else {
			System.out.println("Nenhum aluno cadastrado!");
		}
	}
	public void relatorio() {
		int aprovado = 0;
		int reprovado = 0;
		
		for(int c=0; c<this.quantAluno; c++) {
			if(this.vet[c].getSituacao()) {
				aprovado++;
			}else {
				reprovado++;
			}
		}
		System.out.println("Alunos Aprovados: "+aprovado);
		System.out.println("Alunos Reprovados: "+reprovado);
	}

	@Override
	public String toString() {
		if (this.quantAluno == 0) {
			return "Nenhum aluno cadastrado!";
		} else {
			return "Lista de alunos\n" + Arrays.toString(vet);
		}
	}

	//

}
