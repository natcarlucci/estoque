package apllication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

	public class Program {
			public static void main(String[] args) {
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
				Product prod = new Product();
				
					System.out.println("Insira os dados do produto: ");
					System.out.print("Nome: ");
					prod.nome = sc.nextLine();
						
					System.out.print("Preço: ");
					prod.preco = sc.nextDouble();
						
					System.out.print("Quantidade no estoque: ");
					prod.quantidade = sc.nextInt();
						
					System.out.println();
					System.out.println("Informações do produto: " + prod);
					System.out.println();
						
					System.out.print("Insira o número de produtos a serem ADICIONADOS no estoque: ");
					int quantity = sc.nextInt();
					prod.adicionarProdutos(quantity);
					
					System.out.println();
						
					System.out.println("Dados atualizados: " + prod);
					System.out.println();
						
					System.out.print("Insira o número de produtos a serem REMOVIDOS do estoque: ");
					quantity = sc.nextInt();
					prod.removerProdutos(quantity);
					
					System.out.println();
					System.out.println("Updated data: " + prod);
	
			sc.close();
		}
}
