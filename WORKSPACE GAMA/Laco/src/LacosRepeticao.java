
public class LacosRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Criando um la�o de repeti��o em While
		System.out.println("Criando um la�o com While");
		int contador=0;
		do {
			System.out.println(contador);
			contador++; // Incrementador ou seja � aqui que soma sempre mais 1
		}while(contador<=5); // Condicional 
		
		System.out.println("Criando um la�o com For");
		for(int cont=0; cont<=5; cont++) {
			System.out.println(cont);
		}
		
	}

}
