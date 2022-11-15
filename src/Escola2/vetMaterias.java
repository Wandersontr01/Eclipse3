package Escola2;

public class vetMaterias {
	Aluno aluno = new Aluno();
	private Materia vetMat[];
	private int qtdMateria;
	
	public vetMaterias(int tamanho) {
		this.vetMat = new Materia[tamanho];
		this.qtdMateria = 0;
	}

	public Materia[] getVetMat() {
		return vetMat;
	}
	public String getNomeMat() {
		Main a = new Main();
		for(int c=0; c<this.qtdMateria;c++) {
			if(a.getMateria().equalsIgnoreCase(this.vetMat[c].getNome())){
				return this.vetMat[c].getNome();
			}	
		}
		return "Materia Não Existe!";
	}
	public void setVetMat(Materia[] vetMat) {
		this.vetMat = vetMat;
	}

	public int getQtdMateria() {
		return qtdMateria;
	}
	public void setQtdMateria(int qtdMateria) {
		this.qtdMateria = qtdMateria;
	}
	
	public boolean cadastrarMateria(Materia novo) {
		if(this.vetMat.length == this.qtdMateria) {
			return false;
		}else {
			this.vetMat[this.qtdMateria] = novo;
			this.qtdMateria++;
			return true;
		}
	}
	public int deletarMateriaNome(String nome) {
		for(int c=0; c<this.qtdMateria;c++) {
			if(this.vetMat[c].getNome().equalsIgnoreCase(nome)) {
				this.vetMat[c] = this.vetMat[this.qtdMateria-1];
				this.qtdMateria--;
				return 1;//Materia deletada
			}
		}
		return 2; //materia nao encontrada
	}
	
	
	
}
