package praticajava09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			Queue<String> filaClientes = new LinkedList<>();

			int opcao;
			do {
			    System.out.println("*******************************************************");
			    System.out.println("\033[0;1m" + "1 - Adicionar Cliente na Fila" + "\033[0;1m");
			    System.out.println("\033[0;1m" + "2 - Listar todos Clientes" + "\033[0;1m");
			    System.out.println("\033[0;1m" + "3 - Retirar Cliente da Fila" + "\033[0;1m");
			    System.out.println("\033[0;1m" + "0 - Sair" + "\033[0;1m");
			    System.out.println("*******************************************************");
			    System.out.print("\033[0;1m" + "Entre com a opção desejada: " + "\033[0;1m");
			    opcao = leia.nextInt();
			    leia.nextLine();

			    switch (opcao) {
			        case 1:
			            System.out.print("\033[0;1m" + "\nDigite o nome: " + "\033[0;1m");
			            String nomeCliente = leia.nextLine();
			            filaClientes.add(nomeCliente);
			            System.out.println("\033[0;1m" + "\nCliente Adicionado!" + "\033[0;1m");
			            break;
			        case 2:
			            System.out.println("\033[0;1m" + "\nLista de Clientes na Fila: " + "\033[0;1m");
			            for (String cliente : filaClientes) {
			                System.out.println(cliente);
			            }
			            break;
			        case 3:
			            if (!filaClientes.isEmpty()) {
			                String clienteChamado = filaClientes.poll();
			                System.out.println("\033[0;1m" + "\nO Cliente " + clienteChamado + " foi Chamado!" + "\033[0;1m");
			            } else {
			                System.out.println("\033[0;1m" + "\nA Fila está vazia!" + "\033[0;1m");
			            }
			            break;
			        case 0:
			            System.out.println("\033[0;1m" + "\nPrograma Finalizado!" + "\033[0;1m");
			            break;
			        default:
			            System.out.println("\033[0;1m" + "\nOpção inválida!" + "\033[0;1m");
			            break;
			    }
			} while (opcao != 0);
		}
	}

}
