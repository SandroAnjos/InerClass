package br.com.edlika.InnerClass;

import java.time.LocalDate;

@MyAnnotations("Classe Aluno")
public class Aluno {
	@MyAnnotations("Variavel nome do aluno")
	String nome;
	@MyAnnotations("Variavel ra doa aluno")
	int ra;

	public Aluno() {

		this.ra = 100;
		AlunnoInner a = new AlunnoInner();
		a.AlunnoInnerEmAcao();
		a.numeroFaltas();
	}

	@MyAnnotations("Tipo innerClass Aluno AlunnoInner")
	class AlunnoInner {
		@MyAnnotations("Atributo pertecente ao corpo Tipo innerClass Aluno AlunnoInner")
		int cadastrar;

		@MyAnnotations("Methods  principal da Tipo innerClass Aluno AlunnoInner")
		public void cadastrarAluno(int a) {

			LocalDate lc = LocalDate.of(2007, 1, 1);
			System.out.println("Data de matricula ...: " + lc + " RA do aluno ...: " + a);
			System.out.println(this.cadastrar);
			System.out.println(Aluno.this.ra);

		}

		@MyAnnotations("Metodo responsavel por criar o cadastro e" + " mostrar dados da chamada cadastrarAluno")
		public void AlunnoInnerEmAcao() {

			this.cadastrar = ra;
			AlunnoInner al = new AlunnoInner();
			al.cadastrarAluno(cadastrar);

		}

		private void numeroFaltas() {
			final int FALTAS = 42;
			class MostrarInnerFalta {

				public MostrarInnerFalta() {

				}

				public void mostrarFaltas() {
					System.out.println("Faltas ...:" + FALTAS);
				}

			}
			MostrarInnerFalta f = new MostrarInnerFalta();
			f.mostrarFaltas();

		}

	}
}
