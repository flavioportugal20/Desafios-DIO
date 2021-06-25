import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int N = Integer.parseInt(ler(br));
		for (int i = 0; i < N; i++) {

			StringTokenizer linha = lerST(br);
			if (validarLinha(linha)) {

				String primeiraCadeia = linha.nextToken();
				String segundaCadeia = linha.nextToken();
				if (validarCadeia(primeiraCadeia) && validarCadeia(segundaCadeia)) {

					int tamPriCad = primeiraCadeia.length();
					int tamSecCad = segundaCadeia.length();
					int totalMaiorCadeia = (tamPriCad >= tamSecCad) ? tamPriCad : tamSecCad;
					StringBuilder cadeiaResultante = new StringBuilder();

					for (int e = 0; e < totalMaiorCadeia; e++) {
						if (e < tamPriCad) {
							cadeiaResultante.append(primeiraCadeia.charAt(e));
						}
						if (e < tamSecCad) {
							cadeiaResultante.append(segundaCadeia.charAt(e));
						}
					}
					System.out.println(cadeiaResultante);

				}
			}
		}
		br.close();
	}

	static String ler(BufferedReader br) throws IOException {
		return new StringTokenizer(br.readLine()).nextToken();
	}

	static StringTokenizer lerST(BufferedReader br) throws IOException {
		return new StringTokenizer(br.readLine());
	}

	static boolean validarCadeia(String cadeia) {
		if (cadeia.length() >= 1 && cadeia.length() <= 50) {
			return true;
		}
		System.out.println("A cadeia deve ser (1 ≤ CADEIA ≤ 50), insira novamente a cadeia!");
		return false;
	}

	static boolean validarLinha(StringTokenizer linha) {
		if (linha.countTokens() == 2) {
			return true;
		}
		System.out.println("A linha deve ser apenas DUAS cadeias, insira novamente a linha!");
		return false;
	}
}