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

				String primeiroValor = linha.nextToken();
				String segundoValor = linha.nextToken();
				if (validarValor(primeiroValor) && validarValor(segundoValor)) {
					if (verificarUltimosDigitos(primeiroValor, segundoValor)) {
						System.out.println("encaixa");
					} else {
						System.out.println("nao encaixa");
					}
				}
			}
		}
		br.close();
	}

	static boolean verificarUltimosDigitos(String primeiroValor, String segundoValor) {
		int tamPriValor = primeiroValor.length();
		int tamSecValor = segundoValor.length();

		if (tamPriValor >= tamSecValor && primeiroValor.substring(tamPriValor - tamSecValor).equals(segundoValor)) {
			return true;
		}
		return false;
	}

	static String ler(BufferedReader br) throws IOException {
		return new StringTokenizer(br.readLine()).nextToken();
	}

	static StringTokenizer lerST(BufferedReader br) throws IOException {
		return new StringTokenizer(br.readLine());
	}

	static boolean validarValor(String valor) {
		if (valor.length() >= 1 && valor.length() <= 1000) {
			return true;
		}
		System.out.println("O valor deve ter no máximo 1000 dígitos, insira novamente o valor!");
		return false;
	}

	static boolean validarLinha(StringTokenizer linha) {
		if (linha.countTokens() == 2) {
			return true;
		}
		System.out.println("A linha deve ter apenas DOIS valores, insira novamente os valores!");
		return false;
	}

}