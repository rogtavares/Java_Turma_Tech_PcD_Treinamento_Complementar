import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �rea de declara��o das vari�veis
		String nome_aluno;
		double nota1,nota2,media;
		
		// �rea destinada para pegar as informa��es do aluno
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com o nome do aluno");
		nome_aluno = teclado.next();
		System.out.println("Digite a primeira nota");
		nota1=teclado.nextDouble();
		System.out.println("Digite a segunda nota");
		nota2=teclado.nextDouble();
		media=(nota1+nota2)/2;
		System.out.println("O nome do(a) aluno(a) � "+nome_aluno+" e obteve a m�dia "+media);
		
		if(media<5) {
			System.out.println("Aluno est� reprovado");
		}else if(media==5) {
			System.out.println("Aluno est� recupera��o");
		}else {
			System.out.println("Aluno est� aprovado");
		}
		
		
	}

}
