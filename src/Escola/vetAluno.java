package Escola;

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


	public int cadastrar(Aluno novo) {
		if(this.vet.length == this.quantAluno) {
			return 0; //vetor cheio
		}else {
			this.vet[this.quantAluno+1] = novo;
			this.quantAluno++;
			return 1; //sucesso
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
	//
	
	
}