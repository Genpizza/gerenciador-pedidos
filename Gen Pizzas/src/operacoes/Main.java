package operacoes;

import java.util.Scanner;
	
public class Main {
/*	public static void pular()
	{
		for(int p = 0; p <=20; p++)
		{
				System.out.println("\n");
		}
	}
	*/

	public static void cardapioPizza()
	{
		System.out.println
				("-----------------------------------------------------------------------------------------"
				+"\n*Pizzas*\n"
				+"-----------------------------------------------------------------------------------------"
				+"\nCod     Sabor       Ingredientes                                              Pre�os\n"
				+"1 - 	Mussarela - mussarela, molho de tomate, oregano e rodelas de tomate - 21,00R$\n"
				+"2 - 	Fran Catu - frango desfiado, molho de tomate, catupiry e oregano    - 23,00R$\n"
				+"3 - 	Calabresa - calabreza, molho de tomate, cebola e oregano            - 25,00R$\n"
				+"4 - Sair\n"
				+"-----------------------------------------------------------------------------------------\n");
	}
	
	public static void cardapioBebida()
	{
		System.out.println
				("-----------------------------------------------------------------------------------------"
				+"\n*Bebidas*\n"
				+"-----------------------------------------------------------------------------------------"
				+"\nCod       Marca           Pre�os\n"
				+"1 - 	  Dolly 2L     -  4,50R$\n"
				+"2 - 	  Coca-Cola 2L -  6,00R$\n"
				+"3 - 	  Agua 600ml   -  3,50R$\n"
				+"4 - Sair\n"
				+"-----------------------------------------------------------------------------------------\n");
	}
	
	
	public static void  main(String args[])
	{
		Scanner read = new Scanner(System.in);
		int opInicio;
		String itensPedido = "Itens do pedido\n";
		
		//Menu inicial
			System.out.println("Ol�! O que faremos hoje?\n");
			System.out.println("1_ Registrar um pedido\n");
			System.out.println("2_ Ver lista de pedidos\n");
			System.out.println("3_ Ver faturamento do dia\n");
			System.out.println("Digite o n�mero da op��o para selecionar: ");
			opInicio = read.nextInt();
			
			switch(opInicio) {
			case 1:
				//In�cio pedido
				
				Scanner ler = new Scanner(System.in);
				int opcPizza = 5, opcBebida = 5, qtd = 0, formaPgto;
				double totalPizza = 0, totalBebida = 0, pagoCliente = 0;
				double precos[] = {21,23,25,4.5,6,3.5};

				while(opcPizza != 0)
				{
					cardapioPizza();
					System.out.println("Digite o c�digo da pizza desejada: ");
					opcPizza = ler.nextInt();
						
					if(opcPizza == 1)
					{
						//System.out.println("");
						//if(qtd == 1)
						System.out.println("Pizza sabor *Mussarela* adicionar ao carrinho!");
						totalPizza = totalPizza + precos[0];
						
						//popular vetor do pedido
						for(int i=0;i<1;i++) {
							itensPedido = (itensPedido.concat("1 - 	Mussarela - mussarela, molho de tomate, oregano e rodelas de tomate - 21,00R$\n"));
							i++;
						}
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
						System.out.println("C�digo Invalido! ");
					}
						
					System.out.println("\nGostaria de adicionar mais pizzas? 1 - sim//0 - n�o");
					opcPizza = ler.nextInt();
				
				}	
				
				while(opcBebida != 0)
				{
					cardapioBebida();
					System.out.println("Digite o c�digo da bebida desejada: ");
					opcBebida = ler.nextInt();
					
					if(opcBebida == 1)
					{
						System.out.println("Dolly adicionado ao carrinho!");
						totalBebida = totalBebida + precos[3];
						System.out.println("\nGostaria de adicionar mais bebidas? 1 - sim//0 - n�o\n");
						opcBebida = 0;
						for(int i=0;i<1;i++) {
							itensPedido = (itensPedido.concat("1 - 	  Dolly 2L     -  4,50R$\n"));
							i++;
						}
					}
					else if(opcBebida == 2)
					{
						System.out.println("Coca-cola adicionada ao carrinho!");
						totalBebida = totalBebida + precos[4];
						opcBebida = 0;
					}
					else if(opcBebida == 3)
					{
						System.out.println("�gua adicionada ao carrinho!");
						totalBebida = totalBebida + precos[5];
						opcBebida = 0;
					}
					else if(opcPizza == 4)
					{
						opcPizza = 0;
					}
					else
					{
						System.out.println("C�digo de bebida inv�lido!");
					}
					
					System.out.println("\nGostaria de adicionar mais bebidas? 1 - sim//0 - n�o\n");
					opcBebida = ler.nextInt();
				}
				
				System.out.println("Compra finalizada");
				 
				System.out.println("Qual a forma de pagamento?");		
				System.out.println("1. Dinheiro");
				System.out.println("2. Cart�o de D�bito");
				System.out.println("3. Cart�o de Cr�dito");
		 
				formaPgto=ler.nextInt();
		 
				double total = totalPizza+totalBebida;
				if(formaPgto==1) 
				{
		 
					System.out.println("O valor da comanda � de "+(total*0.9));			
					System.out.println("Qual o valor pago pelo cliente? ");
					pagoCliente = ler.nextFloat();	
					System.out.println("O troco � de "+(pagoCliente - (total*0.9)));
					System.out.println(itensPedido);
				}
				else if(formaPgto == 2) 
				{
					System.out.println("O valor da comanda � de "+total*0.95);
					
					
				}
				else if(formaPgto == 3) 
				{
					System.out.println("O valor da comanda � de "+ total);
				}
				else
				{
					System.out.println("Forma de pagamento n�o configurada");
				}	
				
				//fim pedido
				
				break;
			case 2:
				System.out.println("Mostra lista dos pedidos\n\n");
				for(int i=0;i<1;i++) {
					System.out.println(itensPedido);
				}
				break;
			case 3:
				System.out.println("Mostrar faturamento");

				break;
			default:
				System.out.println("Ops! parece que voc� digitou um n�mero inv�lido\n");
				System.out.println("---------------------------------------------------------------------------------\n\n");
				
			}
	}

}