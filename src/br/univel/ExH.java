package br.univel;

public class ExH implements Desenho {

	public static int ALTURA = 8;

	@Override
	public void desenhar() {

		System.out.println("h)\n\n");
		int esq = ALTURA - 1;

		for (int linha = 0; linha < ALTURA; linha++) {
			for (int coluna = 0; coluna < ALTURA; coluna++) {
				if (esq == coluna) {
					System.out.print('*');
					esq--;
				}
				if (linha == 0 || linha == ALTURA - 1) {
					System.out.print('*');
				} else {
					if (linha == coluna) {
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
