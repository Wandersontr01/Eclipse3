package Escola;

import java.util.Arrays;

public class vetAluno {
	private Aluno [] vet;
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
		if(this.vet.length == this.quantAluno) {
			return false; //vetor cheio
		}else {
			this.vet[this.quantAluno] = novo;
			this.quantAluno++;
			return true; //sucesso
		}
	}
	
	public int deletarPorNome(String nome) {
		if(this.quantAluno == 0) {
		return 0; //vetor vazio
		}else {
			for(int c=0; c<this.quantAluno;c++) {
				if(this.vet[c].getNome().equalsIgnoreCase(nome)) {
					this.vet[c] = this.vet[this.quantAluno-1];
					return 1;
				}
			}
			return 2; //nome nao encontrado na lista
		}
	}
	public int deletarPorMatricula(int matricula) {
		if(this.quantAluno == 0) {
			return 0; //vetor vazio
			}else {
				for(int c=0; c<this.quantAluno;c++) {
					if(this.vet[c].getMatricula() == matricula) {
						this.vet[c] = this.vet[this.quantAluno-1];
						return 1;
					}
				}
				return 2; //nome nao encontrado na lista
			}
	}
	
	public void mostrarAlunoCadastrado() {
		System.out.println("Nome: "+this.vet[this.quantAluno-1].getNome());
		System.out.println("Matricula: "+this.vet[this.quantAluno-1].getMatricula());
	}



	@Override
	public String toString() {
		return "Lista de alunos\n"+Arrays.toString(vet);
	}
	
	//
	
	
}
