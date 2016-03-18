package br.univel;

public class ExM implements Desenho {

	@Override
	public void desenhar() {

		System.out.println("m)\n\n");
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 1; coluna < linha; coluna++) {

				System.out.print(coluna);
			}
			System.out.println();
		}

	}

}
