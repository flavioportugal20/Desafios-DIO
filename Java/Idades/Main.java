import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		int entrada = Integer.parseInt(ler());
		int cont = 0;
		int soma = 0;

		while (entrada > 0) {
			soma += entrada;
			cont++;
			entrada = Integer.parseInt(ler());
		}

		double media = (double) soma / cont;
		System.out.println(String.format("%.2f", media));
		br.close();
	}

	static String ler() throws IOException {
		return new StringTokenizer(br.readLine()).nextToken();
	}

}					