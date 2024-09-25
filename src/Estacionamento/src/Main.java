package Estacionamento.src;


import java.util.Locale;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {

		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		boolean exibirMenu = true;
		
		Estacionamento est = new Estacionamento();
		
		System.out.println("Seja bem vindo ao sistema de estacionamento! ");
		
		System.out.println();
		
		System.out.print("Qual o preço por hora: ");
		est.setPrecoPorHora(sc.nextDouble()); 
		
		System.out.println();
		
		while (exibirMenu) {
			
			System.out.println("Digite a sua opção:");
			System.out.println("1 - Cadastrar veículo");
			System.out.println("2 - Remover veículo");
			System.out.println("3 - Listar veículos");
			System.out.println("4 - Encerrar");
			
			System.out.println();
			
			switch (sc.next())
		    {
		        case "1": 
		        	System.out.print("Informe a placa do veículo: ");
		        	String placa = sc.next();
		        	est.AdicionarVeiculo(placa);
		            break;

		        case "2":
		        	
		        	int quantidadeHoras = 0;
		        	char opcao = 0;
		        	System.out.print("Informe a placa do veículo: ");
		        	String placa1 = sc.next();
		        	if(est.contemVeiculo(placa1)) {
		        		System.out.print("Quantas horas ele Permaneceu no Estacionamneto: ");
		        		quantidadeHoras = sc.nextInt();
		        		System.out.print("Deseja Remover veiculo do Estacionamneto(y/n): ");
		        		opcao = sc.next().charAt(opcao);
		        		if(opcao == 'y' || opcao == 'Y') {
		        			est.RemoverVeiculo(placa1,quantidadeHoras);
		        		}
		        		else {
		        			System.out.println(exibirMenu);
		        		}
		        	}
		        	else{
		        		System.out.println("Veiculo não Encontrado.");
		        	}
	
		            break;

		        case "3":
		            est.ListarVeiculos();
		            break;

		        case "4":
		            exibirMenu = false;
		            break;

		        default:
		        	System.out.println("Opção inválida");
		            break;
		            
		    }
			
			
			System.out.println("Pressione uma tecla para continuar");
			    sc.nextLine();
			
		}
		
		System.out.println("O programa se encerrou");
		
		
		sc.close();
	}
	
	
}
