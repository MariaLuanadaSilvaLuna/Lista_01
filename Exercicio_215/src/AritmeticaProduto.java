import java.util.Scanner;
public class AritmeticaProduto {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira um numero: ");
		int n1 = input.nextInt();
		
		System.out.print("Insira outro numero: ");
		int n2 = input.nextInt();
		
		int Sum = n1+n2;
		System.out.println("A soma e: " + Sum);
		
		int multiplicašao = n1*n2;
		System.out.println("A multiplicašao e: " + multiplicašao);
		
		int subtrašao = n1-n2;
		System.out.println("A subtrašao e: " + subtrašao);
		
		double divisao = (double)(n1) / n2;
		System.out.println("A divisao e: " + divisao);
		
	}

}
