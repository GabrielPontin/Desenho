package br.univel;

public class ExF implements Desenho {

	public static int ALTURA = 8;

	@Override
	public void desenhar() {

		System.out.println("f)\n\n");
		for (int linha = 0; linha < ALTURA; linha++) {
			for (int coluna = 0; coluna < ALTURA; coluna++) {
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
