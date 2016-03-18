package br.univel;

import java.util.ArrayList;
import java.util.List;

public class Desenhar {

	public static void main(String[] args) {

		List<Desenho> lista = new ArrayList<>();

		lista.add(new ExA());
		lista.add(new ExB());
		lista.add(new ExC());
		lista.add(new ExD());
		// lista.add(new ExE());
		// lista.add(new ExF());
		// lista.add(new ExG());
		// lista.add(new ExH());
		// lista.add(new ExI());
		// lista.add(new ExJ());
		// lista.add(new ExM());
		// lista.add(new ExN());

		for (Desenho d : lista) {
			d.desenhar();
		}

	}

}
