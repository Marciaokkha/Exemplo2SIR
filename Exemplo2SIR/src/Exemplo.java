import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		
		int[] v = new int[5]; // Var�avel local
		fill(v); //Argumento do m�todo --> Vari�vel que ser� enviada 
		
		int biggest = biggestValue(v);
		int lower = lowerValue(v);
		
		System.out.println("Maior valor = " + biggest);
		System.out.println("Menor valor = " + lower);
		
	}
	
	public static int biggestValue(int[] v) {
		int aux = v[0];
		for(int i = 1; i < v.length; i++) {
			if(v[i] > aux) { 
				aux = v[i];
			}
		}
		return aux;
	}
	
	public static int lowerValue(int[] v) {
		int aux = v[0];
		for(int i = 1; i < v.length; i++) {
			if(v[i] < aux) { 
				aux = v[i];
			}
		}
		return aux;
	}
	
	public static void fill(int[] v) { // "v" � um par�metro do m�todo --> Vari�vel que vai ser recebida
		Scanner keyboard = new Scanner(System.in);
		for(int i = 0; i < v.length; i++) {
			System.out.print("Valor: ");
			v[i] = keyboard.nextInt();
		}
		keyboard.close();
	}
}
