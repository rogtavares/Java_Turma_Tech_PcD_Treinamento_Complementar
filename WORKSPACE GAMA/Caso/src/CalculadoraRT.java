
/*public class CalculadoraRT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.util.Scanner;

		public class ExecutarCaso {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				int opcao;
				do {
				
				System.out.println("1 - Adi��o");
				System.out.println("2 - Subtra��o");
				System.out.println("3 - Divis�o");
				System.out.println("4 - Multiplica��o");
				System.out.println("5 - Sair");
				
				Scanner teclado = new Scanner(System.in);
				
				System.out.println("Entre com a op��o desejada");
				opcao=teclado.nextInt();
				
				// Com a vari�vel opcao j� tendo um conte�do, vamos escolher qual op��o ser� executado
				
				switch(opcao) {
				case 1:
					int num1,num2,total;
					System.out.println("Digite o Primeiro n�mero");
					num1 = teclado.nextInt();
					System.out.println("Digite o Segundo n�mero");
					num2 = teclado.nextInt();
					total=num1+num2;
					System.out.println("O resultado da soma de :"+num1+"+"+num2+"="+total);
					
					break;
				case 2:
					System.out.println("Digite o Primeiro n�mero");
					num1 = teclado.nextInt();
					System.out.println("Digite o Segundo n�mero");
					num2 = teclado.nextInt();
					total=num1-num2;
					System.out.println("O resultado da soma de :"+num1+"-"+num2+"="+total);
					break;
				case 3:
					System.out.println("Digite o Primeiro n�mero");
					num1 = teclado.nextInt();
					System.out.println("Digite o Segundo n�mero");
					num2 = teclado.nextInt();
					total=num1/num2;
					System.out.println("O resultado da soma de :"+num1+"/"+num2+"="+total);
					break;
				case 4:
					System.out.println("Digite o Primeiro n�mero");
					num1 = teclado.nextInt();
					System.out.println("Digite o Segundo n�mero");
					num2 = teclado.nextInt();
					total=num1*num2;
					System.out.println("O resultado da soma de :"+num1+"*"+num2+"="+total);
					break;
				case 5:
					System.out.println("Sair");
					break;
				default:
					System.out.println("Op��o inv�lida");
				}
			
			}while(opcao<5 ||opcao==0||opcao>5);

		}
		}
	}

}
*/