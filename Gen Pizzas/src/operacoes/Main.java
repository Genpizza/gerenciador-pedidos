package operacoes;

import java.util.Scanner;

public class Main {
	public static void cardapio()
	{
		System.out.println
				("---------------------------------------------------------------------------------"
				+"\n*Pizzas*\n"
				+"Mussarela - mussarela, molho de tomate, oregano e rodelas de tomate - 20,00R$\n"
				+"Fran Catu - frango desfiado, molho de tomate, catupiry e oregano    - 23,00R$\n"
				+"Calabreza - calabreza, molho de tomate, cebola e oregano            - 25,00R$\n"
				+"---------------------------------------------------------------------------------");
	}
	
	public static void menu()
	{
		Scanner read = new Scanner(System.in);
		int opInicio;
		
		//Menu inicial
			System.out.println("Olá! O que faremos hoje?\n");
			System.out.println("1_ Registrar um pedido\n");
			System.out.println("2_ Ver lista de pedidos\n");
			System.out.println("3_ Ver faturamento do dia\n");
			System.out.println("Digite o número da opção para selecionar: ");
			opInicio = read.nextInt();
			
			switch(opInicio) {
			case 1:
				cardapio();
				break;
			case 2:
				System.out.println("Mostra lista dos pedidos\n\n");

				break;
			case 3:
				System.out.println("Mostrar faturamento");

				break;
			default:
				System.out.println("Ops! parece que você digitou um número inválido");
			}
	}
	
	public static void  main(String args[])
	{
		Scanner read = new Scanner(System.in);
		int opInicio;
		
		//Menu inicial
			System.out.println("Olá! O que faremos hoje?\n");
			System.out.println("1_ Registrar um pedido\n");
			System.out.println("2_ Ver lista de pedidos\n");
			System.out.println("3_ Ver faturamento do dia\n");
			System.out.println("Digite o número da opção para selecionar: ");
			opInicio = read.nextInt();
			
			switch(opInicio) {
			case 1:
				cardapio();
				break;
			case 2:
				System.out.println("Mostra lista dos pedidos\n\n");

				break;
			case 3:
				System.out.println("Mostrar faturamento");

				break;
			default:
				System.out.println("Ops! parece que você digitou um número inválido\n");
				System.out.println("---------------------------------------------------------------------------------\n\n");
				menu();
			}
		
	}
}
