import java.util.ArrayList;

public class ExecutaLista {

	public static void main(String[] args) {
		
		/* Criando um ArrayList simples
		ArrayList<String> contatos = new ArrayList();
		
		contatos.add("Vera");
		contatos.add("Letícia");
		contatos.add("Igor");
		contatos.add("João");
		
		// Criando um laço de repetição para mostrar o conteúdo armazenado na variável contatos
		
		for(String nome:contatos) {
			System.out.println(nome);
		}*/
		
		
		// Criando um processo de ArrayList utilizando uma classe com um método
		ArrayList<Contato> contatos = new ArrayList();
		
		Contato contato1 = new Contato("Ricardo","ricardo@terra.com.br","48");
		Contato contato2 = new Contato("Marcos","marcos@terra.com.br","44");
		Contato contato3 = new Contato("Igor","igor@terra.com.br","32");
		Contato contato4 = new Contato("Vanessa","vanessa@terra.com.br","50");
		

		contatos.add(contato1);
		contatos.add(contato2);
		contatos.add(contato3);
		contatos.add(contato4);
		
		// Permite listar todos os registros da nossa Lista
		for(Contato c:contatos) {
			// O retorno do c, nos apresentou uma locação de memória
			//System.out.println(c);
			
			System.out.println(c.getNome()+" - "+c.getEmail()+ " - "+c.getIdade());
		}
		
		// Quero mostrar o total de registros na minha tela 
		System.out.println("O Total de registro é "+contatos.size());
		
		
		// Como localizar somente um registro no ArrayList
		System.out.println(contatos.get(3).getNome());
		
		//Excluindo um registro da nossa lista 
		contatos.remove(2);

		// Como localizar somente um registro no ArrayList
		System.out.println(contatos.get(2).getNome());
	}

}
