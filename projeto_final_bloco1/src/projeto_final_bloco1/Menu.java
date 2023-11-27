package projeto_final_bloco1;

import java.io.IOException;
import java.util.Scanner;
import model.Tipo;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao, id, tipo;
		float valor;
		String peca;
		
		while(true) {
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BRECHÓ ONLINE JAVA                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Peça                       ");
			System.out.println("            2 - Listar Todas as Peças                ");
			System.out.println("            3 - Encontrar Peça por ID                ");
			System.out.println("            4 - Atualizar Peça                       ");
			System.out.println("            5 - Deletar Peça                         ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			
			opcao = leia.nextInt();		
			
			if (opcao == 0) {
				System.out.println("\nPrograma Finalizado!");
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("\nCadastrar Peça\n");
				
				System.out.println("Informe o Tipo da Peça (1 - Parte de Baixo / 2 - Parte de Cima: ");
				tipo = leia.nextInt();
				
				System.out.println("Informe o Nome da Peça a Ser Cadastrada: ");
				peca = leia.next();
				
				System.out.println("Informe o Valor da Peça: ");
				valor = leia.nextFloat();
				
				
				keyPress();
				break;
				
			case 2:
				System.out.println("\nListar Todas as Peças\n");
				
				keyPress();
				break;
				
			case 3:
				System.out.println("\nEncontrar Peça por ID\n");
				System.out.println("Informe o ID da Peça: ");
				id = leia.nextInt();
				
				keyPress();
				break;
				
			case 4:
				System.out.println("\nAtualizar Peça\n");
				System.out.println("Informe o ID da Peça: ");
				id = leia.nextInt();
				
				keyPress();
				break;
				
			case 5:
				System.out.println("\nDeletar Peça\n");
				System.out.println("Informe o ID da Peça: ");
				id = leia.nextInt();
				
				keyPress();
				break;
				
			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;
			}
			
		}

	}
	
public static void keyPress() {
		
		try {
			
			System.out.println("\n\nPressione a tecla Enter para continuar...");
			System.in.read();
			
		}catch(IOException e){
			
			System.out.println("Você pressionou uma tecla inválida!");
			
		}
	}
	
}
