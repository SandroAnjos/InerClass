package br.com.edlika.InnerClass.activity_plan;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ordination {

	int numbers;

	class Modelo {

		int talkmodel;

		public Modelo() {

			this.talkmodel = numbers;

			ordinationLocalInnerclass(talkmodel);
		}

		public void ordinationLocalInnerclass(int ordination) {

			int a[] = new int[100];
			int i, j;
			int back[] = new int[100];
			for (i = 0; i <= ordination; i++) {

				a[i] = ordination;

				for (j = 0; j < a[i]; j--) {
					back[j] = a[i];
				}

				arraylocal(a, back);

			}
		}

	}

	public static void arraylocal(int[] a, int[] back) {

		int x = 0;
		for (int i : a)
			;
		System.out.println("Sequencia inicia ...:" + (x + 1) + "º" + a + "  /Contagem decrescente ..:" + back);

	}



}
