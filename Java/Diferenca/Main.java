import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(ler(br));
		int b = Integer.parseInt(ler(br));
		int c = Integer.parseInt(ler(br));
		int d = Integer.parseInt(ler(br));
		int diferenca = a * b - c * d;

		System.out.printf("DIFERENCA = %s", diferenca);
		br.close();
	}

	static String ler(BufferedReader br) throws IOException {
		return new StringTokenizer(br.readLine()).nextToken();
	}

}