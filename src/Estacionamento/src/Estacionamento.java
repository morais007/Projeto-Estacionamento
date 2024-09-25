package Estacionamento.src;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estacionamento {

	private double precoPorHora;
	private List<String> veiculo = new ArrayList<>();
	
	
	public double getPrecoPorHora() {
		return precoPorHora;
	}

	public void setPrecoPorHora(double precoPorHora) {
		this.precoPorHora = precoPorHora;
	}

	//public List<String> getVeiculo() {
	//	return veiculo;
	//}

	//public void setVeiculo(List<String> veiculo) {
	//	this.veiculo = veiculo;
	//}
	
	public boolean contemVeiculo(String item) {
		return veiculo.contains(item);
	}
	//Metodo para Adicionar veiculo
	public void AdicionarVeiculo(String placa) {
		//this.veiculo = new ArrayList<>();
		veiculo.add(placa);
		System.out.println();
		System.out.println("Veículo com Placa: " + placa + " adicionado com sucesso.");
		System.out.println();
	}
	
	//Metodo pra Remover veiculo
	public void RemoverVeiculo(String placa1,int quantidadeHoras) {
		veiculo.remove(placa1);
		System.out.println("Valor Final a Pagar: " + quantidadeHoras * precoPorHora + "$");
		
		System.out.println("Veiculo Removido do Estacionamneto.");
		
		System.out.println();
	}
	
	//Metodo para Listar todos os veiculos
	public void ListarVeiculos() {
		System.out.println("Quantidade: " + veiculo.size());
		for (String placas : veiculo) {
			System.out.println("Placa: " + placas);
			
		}
		
		System.out.println();
		
	}

	
}
