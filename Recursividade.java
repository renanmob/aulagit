public class Recursividade {
	int acumulador = 1;

	public void fatorial(int n) {
		acumulador = acumulador * n;
		System.out.println("ac: "+acumulador);
		if(n == 1)
			System.out.println("resultado: "+acumulador);
		else
			fatorial(n-1);
	}

	public static void main(String[] args) {
		Recursividade rc = new Recursividade();
		rc.fatorial(4);
		System.out.println("Hello world");	

	}
}
