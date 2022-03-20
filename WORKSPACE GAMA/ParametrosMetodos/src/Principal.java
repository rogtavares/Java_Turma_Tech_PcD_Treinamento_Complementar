import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome,email;
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionario");
		nome=teclado.nextLine();
		
		System.out.println("Entre com o seu email:");
		email=teclado.nextLine();
		
		System.out.println("Digite a sua idade:");
		idade=teclado.nextInt();
		
		// Chamando a nossa classe e o seu método com a passagem de parâmetros
		ProcessaMensagem executa_metodo1 = new ProcessaMensagem();
		executa_metodo1.recebeParametros(nome, email, idade);
		
		
		// Chamando o nosso segundo método
		ProcessaMensagem executa_metodo2 = new ProcessaMensagem();
		executa_metodo2.processaIdade(idade);
		
	}

}
