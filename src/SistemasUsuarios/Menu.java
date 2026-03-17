package SistemasUsuarios;

import java.util.Scanner;

public class Menu {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	SistemaUsuario sistema = new SistemaUsuario();
	int opcao = 0;

	while (opcao!= 5) {	
		System.out.println("1- Cadastrar Usuário");
		System.out.println("2- Listar usuários");
		System.out.println("3- Buscar usuário");
		System.out.println("4- Remover usuário");
		System.out.println("5- Sair");
	
		opcao = entrada.nextInt();
		switch (opcao) {	
		case 1:
			entrada.nextLine();
			System.out.println("Digite o nome do usuário:");
			String nome = entrada.nextLine();
			
			 System.out.println("Digite a idade:");
			 int idade = entrada.nextInt();
			 entrada.nextLine();
			 System.out.println("Digite o email:");
			 String email = entrada.nextLine();
		
		
			 sistema.cadastrar(nome,idade,email);
			
			break;
		case 2:
			System.out.println("\n--- Lista de Usuários ---");
			System.out.println("\n");
			sistema.listar();
			System.out.println("\n\n");
			break;
		case 3:
			System.out.println("\n");
			entrada.nextLine();
			System.out.println("Digite o nome do usuário que deseja buscar:");
			String busca = entrada.nextLine();
			sistema.buscar(busca);
			System.out.println("\n\n");
			break;
		case 4:	
			System.out.println("\n");
			entrada.nextLine();
			System.out.println("Digite o nome do usuário que deseja remover:");
			String remover = entrada.nextLine();
			sistema.remover(remover);
			System.out.println("\n\n");
			break;
		case 5:
			System.out.println("Saindo...");
			entrada.close();
			break;
			
		default:
			
			break;
		} 
		
		
		
	}
	
}
}
