package br.univel;

public class ExC implements Desenho {

	public static int ALTURA = 8;

	@Override
	public void desenhar() {
		System.out.println("c)\n\n");

		int caracteres = 9;
		int brancos = 0;
		for (int linha = 0; linha < 8; linha++) {
			for (int coluna = 0; coluna <= ALTURA; coluna++) {
				if (coluna > brancos) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			brancos++;
			System.out.println();

		}

	}
}