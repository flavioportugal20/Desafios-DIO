import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int a = Integer.parseInt(ler());
		int b = Integer.parseInt(ler());
		int c = Integer.parseInt(ler());
		int d = Integer.parseInt(ler());
		int diferenca = a * b - c * d;

		System.out.printf("DIFERENCA = %s", diferenca);
		br.close();
	}

	static String ler() throws IOException {
		return new StringTokenizer(br.readLine()).nextToken();
	}

}					