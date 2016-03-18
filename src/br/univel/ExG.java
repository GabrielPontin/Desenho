package br.univel;

public class ExG implements Desenho {

	public static int ALTURA = 8;

	@Override
	public void desenhar() {

		System.out.println("g)\n\n");
		for (int linha = 0; linha < ALTURA; linha++) {
			for (int coluna = ALTURA; coluna >= 0; coluna--) {
				if (linha == 0 || linha == ALTURA - 1) {
					System.out.print("*");
				} else {

					if (coluna == linha) {
						System.out.print('*');
					} else {
						System.out.print(' ');
					}
				}

			}
			System.out.println();
		}

	}

}
