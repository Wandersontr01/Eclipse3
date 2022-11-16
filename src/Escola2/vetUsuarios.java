package Escola2;

public class vetUsuarios {
    private Usuarios [] vet;
    private int qtdUsuarios;

    public vetUsuarios(int tamanho){
        this.vet = new Usuarios[tamanho];
        this.qtdUsuarios = 0;
    }
    public int getQtdUsuarios() {
		return qtdUsuarios;
	}
	public void setQtdUsuarios(int qtdUsuarios) {
		this.qtdUsuarios = qtdUsuarios;
	}

    public boolean cadastrarUsuario(Usuarios novo){
        if(this.vet.length == this.qtdUsuarios){
            return false; //vetor de usuarios cheio
        }else{
            this.vet[qtdUsuarios] = novo;
            this.qtdUsuarios++;
            return true; //cadastrado
        }
    }
    public boolean deletaUsuario(String login, String senha){
        for(int c=0; c<this.qtdUsuarios; c++){
            if(this.vet[c].getLogin().equals(login) && this.vet[c].getSenha().equals(senha)){
                this.vet[c] = this.vet[this.qtdUsuarios -1];
                this.qtdUsuarios--;
                return true; //usuario encontrado e deletado
            }
        }
        return false; //usuario nao encontrado
    }

    public boolean autenticador(String login, String senha){
        for(int c=0; c<this.qtdUsuarios; c++){
            if(this.vet[c].getLogin().equals(login) && this.vet[c].getSenha().equals(senha)){
                return true; //login e senha corretos autenticado
            }
        }
        return false; //login ou senha incorretos
    }

}
