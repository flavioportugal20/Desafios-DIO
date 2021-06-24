import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Desafio {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int entrada = Integer.parseInt(ler(br));
		int cont = 0;
		int soma = 0;

		while (entrada > 0) {
			soma += entrada;
			cont++;
			entrada = Integer.parseInt(ler(br));
		}

		double media = (double) soma / cont;
		System.out.println(String.format("%.2f", media));
		br.close();
	}

	static String ler(BufferedReader br) throws IOException {
		return new StringTokenizer(br.readLine()).nextToken();
	}

}