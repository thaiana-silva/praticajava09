package praticajava09;

import java.util.Scanner;
import java.util.Stack;

public class Questao02 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			Stack<String> pilhaLivros = new Stack<>();

			int opcao;
			do {
			    System.out.println("*******************************************************");
			    System.out.println("1 - Adicionar Livro na Pilha");
			    System.out.println("2 - Listar todos Livros");
			    System.out.println("3 - Retirar Livro da Pilha");
			    System.out.println("0 - Sair");
			    System.out.println("*******************************************************");
			    System.out.print("Entre com a opção desejada: ");
			    opcao = leia.nextInt();
			    leia.nextLine();

			    switch (opcao) {
			        case 1:
			            System.out.print("Digite o nome do livro: ");
			            String nomeLivro = leia.nextLine();
			            pilhaLivros.push(nomeLivro);
			            System.out.println("Livro Adicionado!");
			            break;
			        case 2:
			            System.out.println("Lista de Livros na Pilha: ");
			            for (String livro : pilhaLivros) {
			                System.out.println(livro);
			            }
			            break;
			        case 3:
			            if (!pilhaLivros.isEmpty()) {
			                String livroRetirado = pilhaLivros.pop();
			                System.out.println("Um Livro foi retirado!");
			            } else {
			                System.out.println("A Pilha está vazia!");
			            }
			            break;
			        case 0:
			            System.out.println("Programa Finalizado!");
			            break;
			        default:
			            System.out.println("Opção inválida!");
			            break;
			    }
			} while (opcao != 0);
		}
	}

}
