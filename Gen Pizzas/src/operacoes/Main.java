package operacoes;

import java.util.Scanner;

public class Main {
	
	public static void pular()
	{
		for(int p = 0; p <=20; p++)
		{
				System.out.println("\n");
		}
	}
	
	public static void cardapioPizza()
	{
		System.out.println
				("-----------------------------------------------------------------------------------------"
				+"\n*Pizzas*\n"
				+"-----------------------------------------------------------------------------------------"
				+"\nCod     Sabor       Ingredientes                                              Preços\n"
				+"1 - 	Mussarela - mussarela, molho de tomate, oregano e rodelas de tomate - 21,00R$\n"
				+"2 - 	Fran Catu - frango desfiado, molho de tomate, catupiry e oregano    - 23,00R$\n"
				+"3 - 	Calabresa - calabreza, molho de tomate, cebola e oregano            - 25,00R$\n"
				+"4 - Sair"
				+"-----------------------------------------------------------------------------------------");
	}
	
	public static void cardapioBebida()
	{
		System.out.println
				("-----------------------------------------------------------------------------------------"
				+"\n*Bebidas*\n"
				+"-----------------------------------------------------------------------------------------"
				+"\nCod       Marca           Preços\n"
				+"1 - 	  Dolly 2L     -  4,50R$\n"
				+"2 - 	  Coca-Cola 2L -  6,00R$\n"
				+"3 - 	  Agua 600ml   -  3,50R$\n"
				+"4 - Sair"
				+"-----------------------------------------------------------------------------------------");
	}
	
	public static void  main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int opcPizza = 5, opcBebida = 5, qtd = 0;
		double totalPizza = 0, totalBebida = 0;
		double precos[] = {21,23,25,4.5,6,3.5};

		while(opcPizza != 0)
		{
			cardapioPizza();
			System.out.println("Digite o código da pizza desejada: ");
			opcPizza = ler.nextInt();
				
			if(opcPizza == 1)
			{
				System.out.println("");
				if(qtd == 1)
				System.out.println("Pizza sabor *Mussarela* adicionar ao carrinho!");
				totalPizza = totalPizza + precos[0];
				opcPizza = 0;
			}
			else if(opcPizza == 2)
			{
				System.out.println("Pizza sabor *Fran Catu* adicionar ao carrinho!");
				totalPizza = totalPizza + precos[1];
				opcPizza = 0;
			}
			else if(opcPizza == 3)
			{
				System.out.println("Pizza sabor *Calabresa* adicionar ao carrinho!");
				totalPizza = totalPizza + precos[2];
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
			System.out.println("Digite o código da pizza desejada: ");
			opcBebida = ler.nextInt();
			
			if(opcBebida == 1)
			{
				System.out.println("Dolly adicionado ao carrinho!");
				totalBebida = totalBebida + precos[3];
				opcBebida = 0;
			}
			else if(opcBebida == 2)
			{
				System.out.println("Coca-cola adicionada ao carrinho!");
				totalBebida = totalBebida + precos[4];
				opcBebida = 0;
			}
			else if(opcBebida == 3)
			{
				System.out.println("Água adicionada ao carrinho!");
				totalBebida = totalBebida + precos[5];
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
		
		System.out.println("Você saiu do laço!");
		
	}
}
