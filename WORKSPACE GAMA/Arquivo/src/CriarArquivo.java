import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CriarArquivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] nome= {"RT","Jonathan","Nicole"};
		
		// utilizando uma fun��o poara criar um arquivo
		FileWriter arquivo = new FileWriter("c:\\RT.txt");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		
		gravarArquivo.printf("Nome das pessoas"+"%n");
		
		for (int registros=0; registros<3; registros++) {
			gravarArquivo.printf(nome[registros]+"%n");
		}
		arquivo.close();
		System.out.println("Arquivo gerado na unidade c:\nomes.txt");
	}

}
