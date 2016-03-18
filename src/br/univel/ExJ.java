package br.univel;

public class ExJ implements Desenho {
	public static int LARGURA = 13;

	@Override
	public void desenhar() {

		System.out.println("j)\n\n");

		for (int linha = 0; linha < LARGURA; linha++) {
			for (int coluna = 0; coluna < LARGURA; coluna++) {
				System.out
						.print(coluna < linha || coluna >= LARGURA - linha ? " "
								: "*");
			}
			System.out.println();
		}
	}

}
