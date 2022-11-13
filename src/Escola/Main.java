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
				break;
			case 3:
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
		System.out.println("informe o nome do aluno: ");
		String nome = entrada.next();
		System.out.println("Informe a matricula do aluno: ");
		int matricula = entrada.nextInt();
		System.out.println("informe a nota da C1: ");
		double c1 = entrada.nextDouble();
		System.out.println("informe a nota da C2: ");
		double c2 = entrada.nextDouble();
		System.out.println("informe a nota da C2: ");
		double c3 = entrada.nextDouble();
		Aluno aluno = new Aluno(matricula, nome, c1, c2, c3);
		
		if(a.cadastrar(aluno)) {
			System.out.println("Aluno cadastrado!");
			a.mostrarAlunoCadastrado();
		}
	}

}
