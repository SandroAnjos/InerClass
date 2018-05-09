package br.com.edlika.InnerClass;

import java.util.List;

public enum DiaSemana {
	SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
	
	private DiaSemana() {
		
		
	}

	public void mostrarSemana(DiaSemana s) {
		
	Object contagem=s;

		System.out.println(s);
	}

}
