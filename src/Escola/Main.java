package Escola;
import java.util.*;

public class Main {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		vetAluno turma = new vetAluno(30);
		
		System.out.println("MENU");
		int op = 0;
		while(op != 9) {
			System.out.println("Informe o opcao desejada\n"
					+ "[1] Cadastrar Aluno\n"
					+ "[2] Deletar Aluno");
			op = entrada.nextInt();
			
			switch(op) {
			case 1:
				cadastrarAluno(turma);
				break;
			case 2:
				deletarAluno(turma);
				break;
			case 3:
				System.out.println(turma.toString());
				break;
			case 4:
				break;
			case 9:
				System.out.println("Fim de programa!");
				break;
			default:
				System.out.println("A opcao informada é inválida!");
				break;
			}
		}
		
	}
	public static void  cadastrarAluno(vetAluno a) {
		System.out.print("informe o nome do aluno: ");
		String nome = entrada.next();
		System.out.print("Informe a matricula do aluno: ");
		int matricula = entrada.nextInt();
		System.out.print("informe a nota da C1: ");
		double c1 = entrada.nextDouble();
		System.out.print("informe a nota da C2: ");
		double c2 = entrada.nextDouble();
		System.out.print("informe a nota da C2: ");
		double c3 = entrada.nextDouble();
		Aluno aluno = new Aluno(matricula, nome, c1, c2, c3);
		
		if(a.cadastrar(aluno)) {
			System.out.println("Aluno cadastrado!");
			a.mostrarAlunoCadastrado();
		}
	}
	public static void deletarAluno(vetAluno a) {
		if(a.getQuantAluno() == 0) {
			System.out.println("Nenhum Aluno cadastrado!");
		}else {
			System.out.print("Pesqusar por nome ou matricula?");
			String op = entrada.next();
			
			if(op.equalsIgnoreCase("nome")) {
				System.out.print("Informe o nome do aluno: ");
				String nome = entrada.next();
				
				if(a.deletarPorNome(nome) == 0){
					System.out.println("Nenhum Aluno cadastrado!");
				}else if(a.deletarPorNome(nome) == 1) {
					System.out.println("Aluno excluido com sucesso!");
				}else if(a.deletarPorNome(nome) == 2) {
					System.out.println("Aluno não encontrado!");
				}
			}else if(op.equalsIgnoreCase("matricula")) {
				System.out.print("Informe a matricula do aluno: ");
				int matricula = entrada.nextInt();
				
				if(a.deletarPorMatricula(matricula) == 0){
					System.out.println("Nenhum Aluno cadastrado!");
				}else if(a.deletarPorMatricula(matricula) == 1) {
					System.out.println("Aluno excluido com sucesso!");
				}else if(a.deletarPorMatricula(matricula) == 2) {
					System.out.println("Aluno não encontrado!");
				}
			}
			
		}
		
	}

}
