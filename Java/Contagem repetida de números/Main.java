import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(ler(br));
		if (validarN(n)) {
			SortedMap<Integer, Integer> saidas = new TreeMap<>();
			while (n > 0) {
				saidas.compute(Integer.parseInt(ler(br)), (k, v) -> (v == null ? 1 : v + 1));
				n--;
			}
			saidas.entrySet().forEach(entry -> {
				System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
			});
		}

		br.close();
	}

	static String ler(BufferedReader br) throws IOException {
		return new StringTokenizer(br.readLine()).nextToken();
	}

	static boolean validarN(int N) {
		if (N >= 1 && N <= 2000) {
			return true;
		}
		System.out.println("O N deve ser (1 ≤ N ≤ 2000), insira novamente o um novo N!");
		return false;
	}

}
