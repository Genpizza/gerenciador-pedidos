package operacoes;

import java.util.Scanner;
import java.math.*;

public class Main {
	/*
	 * public static void pular() { for(int p = 0; p <=20; p++) {
	 * System.out.println("\n"); } }
	 */

	public static void cardapioPizza() {
		System.out.println("-----------------------------------------------------------------------------------------"
				+ "\n*Pizzas*\n"
				+ "-----------------------------------------------------------------------------------------"
				+ "\nCod     Sabor       Ingredientes                                              Preços\n"
				+ "1 - 	Mussarela - mussarela, molho de tomate, oregano e rodelas de tomate - 21,00R$\n"
				+ "2 - 	Fran Catu - frango desfiado, molho de tomate, catupiry e oregano    - 23,00R$\n"
				+ "3 - 	Calabresa - calabreza, molho de tomate, cebola e oregano            - 25,00R$\n" + "4 - Sair\n"
				+ "-----------------------------------------------------------------------------------------\n");
	}

	public static void cardapioBebida() {
		System.out.println("-----------------------------------------------------------------------------------------"
				+ "\n*Bebidas*\n"
				+ "-----------------------------------------------------------------------------------------"
				+ "\nCod       Marca           Preços\n" + "1 - 	  Dolly 2L     -  4,50R$\n"
				+ "2 - 	  Coca-Cola 2L -  6,00R$\n" + "3 - 	  Agua 600ml   -  3,50R$\n" + "4 - Sair\n"
				+ "-----------------------------------------------------------------------------------------\n");
	}

 
	public static void main(String args[]) {
		int opInicio, x;
		String item="";
		String nome="";
		Scanner ler = new Scanner(System.in);

		double Faturamento = 0;
		do {
		// Menu inicial
		System.out.println("Olá! O que faremos hoje?\n");
		System.out.println("1_ Registrar um pedido\n");
		System.out.println("2_ Ver lista de pedidos\n");
		System.out.println("3_ Ver faturamento do dia\n");
		System.out.println("Digite o número da opção para selecionar: ");
		opInicio = ler.nextInt();

		switch (opInicio) {
		case 1:
			
			int opcPizza = 5, opcBebida = 5, qtd = 0, formaPgto, fimPedido;
			double totalPizza = 0, totalBebida = 0, pagoCliente = 0;
			double precos[] = {21,23,25,4.5,6,3.5};
			
			//Início pedido
			 
			System.out.println("Digite o nome do cliente: ");
			nome=ler.next();
			item=(item.concat("\n<*}) Pedido de: "+nome+"\n"));
			
			while(opcPizza != 0)
		{
			cardapioPizza();
			System.out.println("Digite o código da pizza desejada: ");
			opcPizza = ler.nextInt();

			if(opcPizza == 1)
			{
				//System.out.println("");
				//if(qtd == 1)
				System.out.println("Pizza sabor *Mussarela* adicionar ao carrinho!");
				totalPizza = totalPizza + precos[0];
				item=(item.concat("1 - Mussarela - 21,00R$\n"));
				opcPizza = 0;
			}
			else if(opcPizza == 2)
			{
				System.out.println("Pizza sabor *Fran Catu* adicionar ao carrinho!");
				totalPizza = totalPizza + precos[1];
				item=(item.concat("1 - Fran Catu - 23,00R$\n"));
				opcPizza = 0;
			}
			else if(opcPizza == 3)
			{
				System.out.println("Pizza sabor *Calabresa* adicionar ao carrinho!");
				totalPizza = totalPizza + precos[2];
				item=(item.concat("1 - Calabresa - 25,00R$\n"));
				opcPizza = 0;
			}
			else if(opcPizza == 4)
			{
				opcPizza = 0;
			}
			else
			{
				System.out.println("Código Invalido! ");
			}

			System.out.println("\nGostaria de adicionar mais pizzas? 1 - sim//0 - não");
			opcPizza = ler.nextInt();

		}	

		while(opcBebida != 0)
		{
			cardapioBebida();
			System.out.println("Digite o código da bebida desejada: ");
			opcBebida = ler.nextInt();

			if(opcBebida == 1)
			{
				System.out.println("Dolly adicionado ao carrinho!");
				totalBebida = totalBebida + precos[3];
				item=(item.concat("1 - Dolly 2L - 4,50R$\n"));
				opcBebida = 0;
			}
			else if(opcBebida == 2)
			{
				System.out.println("Coca-cola adicionada ao carrinho!");
				totalBebida = totalBebida + precos[4];
				item=(item.concat("1 - Coca-Cola 2L -  6,00R$\n"));
				opcBebida = 0;
			}
			else if(opcBebida == 3)
			{
				System.out.println("Água adicionada ao carrinho!");
				totalBebida = totalBebida + precos[5];
				item=(item.concat("1 - Agua 600ml - 3,50R$\n"));
				opcBebida = 0;
			}
			else if(opcPizza == 4)
			{
				opcPizza = 0;
			}
			else
			{
				System.out.println("Código de bebida inválido!");
			}

			System.out.println("\nGostaria de adicionar mais bebidas? 1 - sim//0 - não");
			opcBebida = ler.nextInt();
		}

		
		System.out.println("Qual a forma de pagamento?");		
		System.out.println("1. Dinheiro");
		System.out.println("2. Cartão de Débito");
		System.out.println("3. Cartão de Crédito");

		formaPgto=ler.nextInt();

		double total = totalPizza+totalBebida;

	while(formaPgto!=0) {
		if(formaPgto==1) 
		{		 
			System.out.printf("O valor da comanda é de %.2f",(total*0.9),"/n");			
			System.out.println("\nQual o valor pago pelo cliente? ");
			pagoCliente = ler.nextFloat();	
			System.out.printf("O troco é de %.2f",(pagoCliente - (total*0.9)));
			formaPgto=0;
		Faturamento=Faturamento+(total*0.9);
		}
		else if(formaPgto == 2) 
		{
			System.out.printf("O valor da comanda é de %.2f",total*0.95);
			formaPgto=0;
		Faturamento=Faturamento+(total*0.95);	
		}
		else if(formaPgto == 3) 
		{
			System.out.printf("O valor da comanda é de %.2f", total);
			formaPgto=0;
		Faturamento=Faturamento+(total);
		}
		else
		{
			System.out.println("Forma de pagamento não configurada");
			formaPgto=0;
			System.out.println("Qual a forma de pagamento?\n");		
			System.out.println("1. Dinheiro");
			System.out.println("2. Cartão de Débito");
			System.out.println("3. Cartão de Crédito");

			formaPgto=ler.nextInt();
		}
		System.out.println("\nDigite 0 para finalizar o pedido");
		fimPedido=ler.nextInt();
		
	}
			break;
		case 2:
			System.out.println("---------------------------------------------------------------------------------\n");
			System.out.println("Lista de pedidos");
			System.out.println("---------------------------------------------------------------------------------\n");
			System.out.println("\n"+item+"\n");
			System.out.println("---------------------------------------------------------------------------------\n\n");
			break;
		
		case 3:
			System.out.println("---------------------------------------------------------------------------------\n\n");
			System.out.println("O faturamento do dia foi de: R$" + Faturamento);
			System.out.println("---------------------------------------------------------------------------------\n\n");

			break;
		default:
			System.out.println("Ops! parece que você digitou um número inválido\n");
			System.out.println("---------------------------------------------------------------------------------\n\n");
		}
		x = 1;
		} while (x!=0);
		
		
	}
}
