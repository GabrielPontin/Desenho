package br.univel;

public class ExB implements Desenho {

	@Override
	public void desenhar() {
		System.out.println("b)\n\n");

		for (int i = 1; i < 9; i++) {
			for (int j = 9; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
