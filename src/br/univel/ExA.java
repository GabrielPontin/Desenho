package br.univel;

public class ExA implements Desenho {

	@Override
	public void desenhar() {
		System.out.println("a)\n\n");
		for (int i = 1; i < 9; i++) {
			for (int j = 0; j < i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}
}
