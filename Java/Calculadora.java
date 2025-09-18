package metodos;

public class Calculadora {

	public static void main(String[] args) {
		CalcularMetodos c1 = new CalcularMetodos();
		int r;
		r = c1.somar(5,10);
		System.out.printf("O valor da soma de 2 números é %d \n", r);
		r = c1.somar(1, 2, 3);
		System.out.printf("O valor da soma de 3 números é %d \n", r);
	}
}

	
