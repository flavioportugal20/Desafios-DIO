import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		float mediaPonderada, exame, mediaFinal;
		float[] pesos = {2, 3, 4, 1};
		float[] notas = new float[pesos.length];
		StringTokenizer stNotas = lerST(br);

		int i = 0;
		while (stNotas.hasMoreTokens()) {
			if (i >= notas.length) {
				System.out.println("Quantidade de notas diferente da quantidade de pesos!");
				return;
			}
			notas[i] = Float.valueOf(stNotas.nextToken());
			i++;
		}

		mediaPonderada = calcularMediaPonderada(notas, pesos);
		System.out.printf("Media: %.1f\n", mediaPonderada);

		if (mediaPonderada >= 7.0) {
			System.out.printf("Aluno aprovado.\n");
		} else if (mediaPonderada < 5.0) {
			System.out.printf("Aluno reprovado.\n");
		} else if (mediaPonderada >= 5.0 && mediaPonderada <= 6.9) {//não pertence {6.91 ... 6.99}
			System.out.printf("Aluno em exame.\n");

			exame = Float.valueOf(ler(br));
			mediaFinal = (mediaPonderada + exame) / 2;
			System.out.printf("Nota do exame: %.1f\n", exame);

			if (mediaFinal >= 5.0) {
				System.out.printf("Aluno aprovado.\n");
			} else if (mediaFinal <= 4.9) {//não pertence {4.91 ... 4.99}
				System.out.printf("Aluno reprovado\n");
			}

			System.out.printf("Media final: %.1f\n", mediaFinal);
		}

		br.close();
	}

	static float calcularMediaPonderada(float[] notas, float[] pesos) {
		float somaNotasXPesos = 0;
		float totalPesos = 0;
		for (int i=0; i<pesos.length; i++) {
			somaNotasXPesos += notas[i] * pesos[i];
			totalPesos += pesos[i];
		}
		return somaNotasXPesos / totalPesos;
	}

	static String ler(BufferedReader br) throws IOException {
		return new StringTokenizer(br.readLine()).nextToken();
	}

	static StringTokenizer lerST(BufferedReader br) throws IOException {
		return new StringTokenizer(br.readLine());
	}
}