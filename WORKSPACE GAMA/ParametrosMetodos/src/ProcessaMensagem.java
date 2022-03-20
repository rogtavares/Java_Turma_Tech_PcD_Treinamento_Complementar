
public class ProcessaMensagem {

	// Desenvolvendo um método nesta classe com parâmetros
	public void  recebeParametros(String nome, String email, int idade) {
		System.out.println("O funcionario "+nome+ " tem "+idade+ " idade e o email de contato é "+email );
	}
	
	// Criando um outro método no nosso sistema
	public void processaIdade(int idade) {
		System.out.println("O ano de nascimento deste funcionário é "+(idade-2022));
	}
}
