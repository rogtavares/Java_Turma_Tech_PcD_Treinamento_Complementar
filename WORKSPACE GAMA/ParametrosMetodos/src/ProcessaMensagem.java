
public class ProcessaMensagem {

	// Desenvolvendo um m�todo nesta classe com par�metros
	public void  recebeParametros(String nome, String email, int idade) {
		System.out.println("O funcionario "+nome+ " tem "+idade+ " idade e o email de contato � "+email );
	}
	
	// Criando um outro m�todo no nosso sistema
	public void processaIdade(int idade) {
		System.out.println("O ano de nascimento deste funcion�rio � "+(idade-2022));
	}
}
