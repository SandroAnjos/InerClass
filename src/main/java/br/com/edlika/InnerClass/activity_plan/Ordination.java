package br.com.edlika.InnerClass.activity_plan;

public class Ordination {

	static int numbers = 100;

	static class Modelo {

		int talkmodel;

		public Modelo() {

			// this.talkmodel = numbers;
			talkmodel = (int) 100;
			ordinationLocalInnerclass(talkmodel);

		}

		public void ordinationLocalInnerclass(int ordination) {

			int[] back = new int[100];
			int fronte[] = new int[100];
			int i, j, z = 0, z2 = 0;

			try {

				for (i = 0; i <= ordination; i++) {
					fronte[i] = i;
					// System.out.println("..." + fronte[z]);
					for (j = 0; j <= fronte[i]; j++) {
						if (fronte[i] > back[j]) {
							int temp = fronte[i];
							fronte[i] = back[j];
							back[j] = temp;
							System.out.println("Back ..:" + back[j]);

						}
						// back[z2] = j;
						// if (back[z2] <= ordination) {
						//
						// }
					}
				}

				throw new ArrayIndexOutOfBoundsException();

			} catch (Exception e) {
				// TODO: handle exception
			}

			// arraylocal(fronte[i], back[j]);

		}

	}

	@SuppressWarnings("unused")
	public static void arraylocal(int a, int back) {
		Ordination r = new Ordination();
		int localarray[] = new int[a];
		int x = 0;
		// for (int i : localarray)
		// ;
		// System.out.println("Sequencia inicia ...:" + (x + 1) + "º" + a + " /Contagem
		// decrescente ..:" + back);

	}

	public Ordination() {
		// TODO Auto-generated constructor stub
		Modelo mostrar = new Modelo();

	}
}
