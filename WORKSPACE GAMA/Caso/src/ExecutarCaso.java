import java.util.Scanner;

public class ExecutarCaso {

	public static void main(String[] args) {
		System.out.println("1 - Ai��o");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Divis�o");
		System.out.println("4 - Multiplica��o");
		System.out.println("5 - Sair");
		
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		do {
		System.out.println("Entre com a op��o desejada");
		opcao=teclado.nextInt();
		
		switch(opcao) {
		case 1:
			int num1, num2, total;
			System.out.println("Digite o Primeiro n�mero");
			num1 = teclado.nextInt();
			System.out.println("Digite o Segundo n�mero");
			num2 = teclado.nextInt();
			total=num1+num2;
			System.out.println("O resultado da soma de :"+num1+num2+"+"+num2+"="+total);
			break;
		case 2:
			int n1, n2, tl;
			System.out.println("Digite o Primeiro n�mero");
			n1 = teclado.nextInt();
			System.out.println("Digite o Segundo n�mero");
			n2 = teclado.nextInt();
			tl=n1/n2;
			System.out.println("O resultado da soma de :"+n1+n2+"-"+n2+"="+tl);
			break;
		case 3:
			double d1, d2, tld;
			System.out.println("Digite o Primeiro n�mero");
			d1 = teclado.nextDouble();
			System.out.println("Digite o Segundo n�mero");
			d2 = teclado.nextDouble();
			tld=d1/d2;
			System.out.println("O resultado da soma de :"+d1+d2+"/"+d2+"="+tld);
			break;
		case 4:
			System.out.println("Voc� escolher fazer uma Multiplica��o");
			break;
		case 5:
			System.out.println("Sair");
			break;
		default:
			System.out.println("Op��o inv�lida");
		}
		
	}while(opcao<5 || opcao==0 ||opcao>5);
	
}
}
