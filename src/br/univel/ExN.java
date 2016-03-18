package br.univel;

public class ExN implements Desenho {
	public static int ALTURA = 9;

	@Override
	public void desenhar() {

		System.out.println("n)\n\n");

		int caracteres = 9;
		int brancos = 0;
		for (int linha = 1; linha < ALTURA; linha++) {
			for (int coluna = 1; coluna <= ALTURA; coluna++) {
				if (coluna > brancos) {
					System.out.print(coluna);
				} else {
					System.out.print(" ");
				}
			}
			brancos++;
			System.out.println();

		}

	}
}