package br.univel;

public class ExE implements Desenho {

	@Override
	public void desenhar() {

		System.out.println("e)\n\n");

		int heigth = 5;
		int width = 10;

		for (int linha = 0; linha < heigth; linha++) {
			for (int altura = 0; altura < width; altura++) {
				if (linha == 0 || linha == heigth - 1) {
					System.out.print('*');
				} else {
					if (altura == 0 || altura == width - 1) {
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
