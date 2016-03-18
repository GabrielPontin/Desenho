package br.univel;

public class ExD implements Desenho {

	public static int ALTURA = 8;

	@Override
	public void desenhar() {

		System.out.println("d)\n\n");

		int brancos = 8;
		for (int linha = 0; linha < 8; linha++) {
			for (int coluna = 0; coluna < ALTURA; coluna++) {
				if (coluna < brancos) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			brancos--;
			System.out.println();
		}
	}

}
