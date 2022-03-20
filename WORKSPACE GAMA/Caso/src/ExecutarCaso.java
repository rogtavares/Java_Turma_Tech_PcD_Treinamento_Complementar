import java.util.Scanner;

public class ExecutarCaso {

	public static void main(String[] args) {
		System.out.println("1 - Aição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.println("5 - Sair");
		
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		do {
		System.out.println("Entre com a opção desejada");
		opcao=teclado.nextInt();
		
		switch(opcao) {
		case 1:
			int num1, num2, total;
			System.out.println("Digite o Primeiro número");
			num1 = teclado.nextInt();
			System.out.println("Digite o Segundo número");
			num2 = teclado.nextInt();
			total=num1+num2;
			System.out.println("O resultado da soma de :"+num1+num2+"+"+num2+"="+total);
			break;
		case 2:
			int n1, n2, tl;
			System.out.println("Digite o Primeiro número");
			n1 = teclado.nextInt();
			System.out.println("Digite o Segundo número");
			n2 = teclado.nextInt();
			tl=n1/n2;
			System.out.println("O resultado da soma de :"+n1+n2+"-"+n2+"="+tl);
			break;
		case 3:
			double d1, d2, tld;
			System.out.println("Digite o Primeiro número");
			d1 = teclado.nextDouble();
			System.out.println("Digite o Segundo número");
			d2 = teclado.nextDouble();
			tld=d1/d2;
			System.out.println("O resultado da soma de :"+d1+d2+"/"+d2+"="+tld);
			break;
		case 4:
			System.out.println("Você escolher fazer uma Multiplicação");
			break;
		case 5:
			System.out.println("Sair");
			break;
		default:
			System.out.println("Opção inválida");
		}
		
	}while(opcao<5 || opcao==0 ||opcao>5);
	
}
}
