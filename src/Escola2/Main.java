package Escola2;

import java.util.*;

public class Main {
	static Scanner entrada = new Scanner(System.in);
	static String materia;

	public static void main(String[] args) {
		vetAluno turma = new vetAluno(30);
		vetMaterias mat = new vetMaterias(5);
		Aluno aluno1 = new Aluno(22110354, "Wanderson", "matematica",10, 10, 10);
		Aluno aluno2 = new Aluno(22110322, "Douglas", "Portugues",5.5, 2.4, 5.9);
		Aluno aluno3 = new Aluno(22110345, "Mateus", "matematica",7.5, 8.9, 9.8);
		Aluno aluno4 = new Aluno(22110093, "Felipe", "portugues",2.5, 3.4, 6.6);
		turma.cadastrar(aluno1);
		turma.cadastrar(aluno2);
		turma.cadastrar(aluno3);
		turma.cadastrar(aluno4);
		Materia materia1 = new Materia("Matematica", "Prof_Rafael");
		Materia materia2 = new Materia("Portugues", "Prof_Carla");
		mat.cadastrarMateria(materia1);
		mat.cadastrarMateria(materia2);
		
		
		System.out.println("MENU2");
		int op = 0;
		while (op != 9) {
			System.out.println("\n\nInforme o opcao desejada\n"
					+ "[1] Cadastrar Aluno\n"
					+ "[2] Deletar Aluno\n"
					+ "[3] Mostrar todos Alunos Registrados\n"
					+ "[4] Calcula media geral de todos Alunos");
			
			op = entrada.nextInt();

			switch (op) {
			case 1:
				cadastrarAluno(turma, mat);
				break;
			case 2:
				deletarAluno(turma);
				break;
			case 3:
				turma.mostrarTodos();
				break;
			case 4:
				turma.calcularMediaGeral();
				break;
			case 5:
				turma.relatorio();
				break;
			case 6:
				mat.mostrarMaterias();
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

	public static void cadastrarAluno(vetAluno a, vetMaterias mat) {
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
		System.out.println("Informe a materia: ");
		materia = entrada.next();
		for(int c=0; c<mat.getQtdMateria(); c++){
			boolean resultado = mat.procuraMateria(materia);
			if(resultado == false){
				System.out.println("A materia Informada não existe!");
				System.out.print("Informe uma matéria válida: ");
				materia = entrada.next();
			}
		}
		
		
		Aluno aluno = new Aluno(matricula, nome, materia,c1, c2, c3);

		if (a.cadastrar(aluno)) {
			System.out.println("Aluno cadastrado!");
			a.mostrarAlunoCadastrado();
		}
	}

	public static void deletarAluno(vetAluno a) {
		if (a.getQuantAluno() == 0) {
			System.out.println("Nenhum Aluno cadastrado!");
		} else {
			System.out.print("Pesqusar por nome ou matricula?");
			String op = entrada.next();

			if (op.equalsIgnoreCase("nome")) {
				System.out.print("Informe o nome do aluno: ");
				String nome = entrada.next();
				int result = a.deletarPorNome(nome);
				if (result == 0) {
					System.out.println("Nenhum Aluno cadastrado!");
				} else if (result == 1) {
					System.out.println("Aluno excluido com sucesso!");
				} else if (result == 2) {
					System.out.println("Aluno não encontrado!");
				}
			} else if (op.equalsIgnoreCase("matricula")) {
				System.out.print("Informe a matricula do aluno: ");
				int matricula = entrada.nextInt();
				int result = a.deletarPorMatricula(matricula);

				if (result == 0) {
					System.out.println("Nenhum Aluno cadastrado!");
				} else if (result == 1) {
					System.out.println("Aluno excluido com sucesso!");
				} else if (result == 2) {
					System.out.println("Aluno não encontrado!");
				}
			}

		}

	}
	public String getMateria() {
		return materia;
	}

}
